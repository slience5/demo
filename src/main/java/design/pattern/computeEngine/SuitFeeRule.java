package design.pattern.computeEngine;

import design.pattern.computeEngine.entity.InsuredInfo;

/**
 *
 * 按套餐计费规则
 *
 * 按套餐范围计算费用，超出范围增加附加费
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-29
 **/
public class SuitFeeRule extends BaseFeeRule {

    /**
     * 命中条件：保障时间在套餐时间范围内 && （不按年龄配置 || 按年龄配置且年龄符合要求）
     * @param insuredInfo
     * @return
     */
    @Override
    public boolean isHit(InsuredInfo insuredInfo) {
        // 年龄不符
        if(isByAge(isByAge) && !isAgeHit(insuredInfo.getBirthday())){
            return false;
        }

        Integer insurancePeriod = insuredInfo.getInsurancePeriods(timeUnit);

        // 保障周期超过套餐约定时间范围
        if(insurancePeriod < startTime || insurancePeriod > timeMost){
            return false;
        }

        return true;
    }

    @Override
    public Integer compute(InsuredInfo insuredInfo) {
        Integer insurancePeriod = insuredInfo.getInsurancePeriods(timeUnit);

        // 套餐费用
        Integer priceCompute = price;
        if(insurancePeriod > endTime){
            // 附加费用
            priceCompute = priceCompute + computeAdditionalFee(insurancePeriod);
        }
        return priceCompute;
    }

    /**
     * 计算附加费用
     * @param insurancePeriod
     * @return
     */
    private Integer computeAdditionalFee(Integer insurancePeriod){
        return (insurancePeriod - endTime) * additionalFee;
    }
}
