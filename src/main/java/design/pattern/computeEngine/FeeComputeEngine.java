package design.pattern.computeEngine;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import design.pattern.computeEngine.entity.InsuredInfo;
import utils.UUIDUtil;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * 保险计费试算引擎
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-29
 **/
public class FeeComputeEngine{

    private FeeRuleFactory feeRuleFactory = new FeeRuleFactory();
//    private InsuranceCustomizeDiscountService insuranceCustomizeDiscountService;

    /**
     * 计算保费
     * @param planId
     * @param insuredInfo
     * @return
     */
    public Integer compute(String planId, InsuredInfo insuredInfo) throws Exception {
        List<BaseFeeRule> rules = feeRuleFactory.getRules(planId);
        if(CollectionUtil.isEmpty(rules)){
            throw new Exception(String.format("未找到%s产品对应计费规则",planId));
        }

        for (InsuranceFeeRule rule : rules){
            if(rule.isHit(insuredInfo)){
                return rule.compute(insuredInfo);
            }
        }

        return null;
//        throw new OpenException(String.format("未找到%s产品匹配的计费规则",planId),RetCode.ARGUMENT_INVALID);
    }

    /**
     * 根据折扣计算保费
     * @param planId
     * @param insuredInfo
     * @return
     */
    public FeeResult computeWithDiscount(String planId,Integer companyId,InsuredInfo insuredInfo) throws Exception {
        List<BaseFeeRule> rules = feeRuleFactory.getRules(planId);
        if(CollectionUtil.isEmpty(rules)){
            throw new Exception(String.format("未找到%s产品对应计费规则",planId));
        }

//        InsuranceCustomizeDiscountDO customizeDiscountDO = insuranceCustomizeDiscountService.findByCompanyIdAndPlanId(companyId,planId);

        BigDecimal discount = new BigDecimal(0.75);

        Integer coupon = 1000;

        for (BaseFeeRule rule : rules){
            if(rule.isHit(insuredInfo)){
                // 商家自定义折扣
                if(discount != null){
                    rule = new DistcountFeeRule(discount,rule);
                }
                if(coupon != null){
                    rule = new CouponFeeRule(coupon,rule);
                }
                return rule.computeWithDiscount(insuredInfo);
            }
        }

        return null;
//        throw new OpenException(String.format("未找到%s产品匹配的计费规则",planId),RetCode.ARGUMENT_INVALID);
    }

    public static void main(String[] args) throws Exception {
        InsuredInfo info = new InsuredInfo();
        info.setBirthday(DateUtil.parse("1994-12-20", DatePattern.NORM_DATE_FORMAT));
        info.setName("jinlei");
        info.setUniqueId(UUIDUtil.getID());
        info.setStartDate(DateUtil.parse("2020-07-01", DatePattern.NORM_DATE_FORMAT));
        info.setEndDate(DateUtil.parse("2020-07-08", DatePattern.NORM_DATE_FORMAT));

        FeeComputeEngine engine = new FeeComputeEngine();

        System.out.println(JSON.toJSONString(engine.computeWithDiscount("test",1,info)));
    }
}
