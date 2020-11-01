package design.pattern.computeEngine;

import design.pattern.computeEngine.entity.InsuredInfo;

import java.math.BigDecimal;

/**
 *
 * 按时间计费规则
 *
 * 直接按保险周期（天/月/年） 计算费用
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-29
 **/
public class DistcountFeeRule extends BaseFeeRule{

    private BaseFeeRule baseFeeRule;

    private BigDecimal discount;

    public DistcountFeeRule(BigDecimal discount,BaseFeeRule baseFeeRule){
        this.discount = discount;
        this.baseFeeRule = baseFeeRule;
    }

    /**
     * 命中条件：不按年龄配置 / 按年龄配置且年龄在配置范围内
     * @param insuredInfo
     * @return
     */
    @Override
    public boolean isHit(InsuredInfo insuredInfo) {
        return baseFeeRule.isHit(insuredInfo);
    }

    /**
     * 计算规则 ： 单价 * 时间
     * @param insuredInfo
     * @return
     */
    @Override
    public Integer compute(InsuredInfo insuredInfo) {
       return baseFeeRule.compute(insuredInfo);
    }

    @Override
    public Integer computeReal(InsuredInfo insuredInfo) {
        return discount.multiply(new BigDecimal(baseFeeRule.computeReal(insuredInfo))).intValue();
    }
}
