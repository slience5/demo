package design.pattern.computeEngine;

import cn.hutool.core.bean.BeanUtil;
import design.pattern.computeEngine.entity.InsuranceFeeTypeEnum;
import design.pattern.computeEngine.entity.InsurancePlanExtendDO;
import design.pattern.computeEngine.entity.InsurancePlanService;
import design.pattern.computeEngine.entity.InsurancePriceRuleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.InitializingBean;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

/**
 * 规则创建工厂
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-30
 **/
@Slf4j
public class FeeRuleFactory implements InitializingBean {

    private static Map<String, List<BaseFeeRule>> ruleMap = new HashMap<>();

    private static final ConcurrentHashMap<String, FutureTask<List<BaseFeeRule>>> tasks = new ConcurrentHashMap<>();


    private InsurancePlanService insurancePlanService = new InsurancePlanService();

    /**
     * 获取保险保险计费规则
     * @param planId 保险计划id
     * @return
     */
    public List<BaseFeeRule> getRules(String planId) {
        return ruleMap.computeIfAbsent(planId,(k) -> initRulesByPlanIdTask(planId));
    }

    /**
     * 清除保险计费规则缓存
     * @param planId 保险计划id
     */
    public static void removeRules(String planId){
        ruleMap.remove(planId);
        tasks.remove(planId);
        log.info("[保险计费规则] 删除保险计费规则缓存 planId:{}",planId);
    }

    /**
     * 通过异步任务加载规则
     * @param planId
     * @return
     */
    private List<BaseFeeRule> initRulesByPlanIdTask(String planId){
        FutureTask<List<BaseFeeRule>> task = tasks.get(planId);
        if(task == null){
            FutureTask<List<BaseFeeRule>> taskNew = new FutureTask<>(() -> initRulesByPlanId(planId));
            task = tasks.putIfAbsent(planId,taskNew);
            if(task == null){
                task = taskNew;
                taskNew.run();
            }
        }
        try {
            return task.get(60, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            log.error("[保险计费规则] 加载保险计费规则失败 planId:{}",planId,e);
//            throw new Exception("加载保险计费规则失败");
        } catch (CancellationException | InterruptedException | TimeoutException e){
            log.error("[保险计费规则] 加载保险计费规则任务中断 planId:{}",planId,e);
            tasks.remove(planId);
        }

        return null;
    }

    private List<BaseFeeRule> initRulesByPlanId(String planId){
        log.info("[保险计费规则] 加载保险计费规则 planId:{}",planId);

        List<InsurancePriceRuleDO> ruleDOs = insurancePlanService.findRulesByPlanId(planId);
        InsurancePlanExtendDO planExtend = insurancePlanService.findPlanExtendDOById(planId);

        return  ruleDOs.stream()
                // 按照dindex排序
                .sorted(Comparator.comparing(InsurancePriceRuleDO::getDindex))
                .map(ruleDO -> getRule(ruleDO,planExtend)).collect(Collectors.toList());
    }

    private BaseFeeRule getRule(InsurancePriceRuleDO ruleDO,InsurancePlanExtendDO planExtend) {
        if(ruleDO == null || ruleDO.getFeeType() == null){
            return null;
        }

        BaseFeeRule baseFeeRule = null;
        baseFeeRule = null;
        switch (InsuranceFeeTypeEnum.of(ruleDO.getFeeType())){
            case BY_DAY:
            case BY_MONTH:
            case BY_YEAR:
                baseFeeRule = new TimeFeeRule();
                BeanUtil.copyProperties(ruleDO,baseFeeRule);
                break;
            case BY_SUIT:
                baseFeeRule = new SuitFeeRule();
                BeanUtil.copyProperties(ruleDO,baseFeeRule);
                break;
            default:
                // do nothing
        }


        if(baseFeeRule != null && planExtend != null){
            baseFeeRule.setMerchantDiscount(planExtend.getMerchantDiscount());
            baseFeeRule.setPlatformDiscount(planExtend.getPlatformDiscount());
        }

        return baseFeeRule;
    }

//    private void initRules(){
//        List<InsurancePlanDO> plans = insurancePlanService.findValidPlanDOs();
//
//        if(CollectionUtils.isEmpty(plans)){
//            log.warn("[保险计费规则初始化] 保险计划为空");
//            return;
//        }
//
//        plans.forEach(plan -> initRulesByPlanId(plan.getUid()));
//    }

    @Override
    public void afterPropertiesSet(){
//        initRules();
    }
}
