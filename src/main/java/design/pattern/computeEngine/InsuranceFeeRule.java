package design.pattern.computeEngine;

import design.pattern.computeEngine.entity.InsuredInfo;

public interface InsuranceFeeRule {

    /**
     * 按年龄配置
     */
    int BY_AGE = 1;

    /**
     * 是否按照年龄配置
     * @param isByAge
     * @return
     */
    default boolean isByAge(int isByAge){
        return BY_AGE == isByAge;
    }

    /**
     * 是否命中当前规则
     *
     * 按套餐计费才需要做命中校验
     *
     * @param insuredInfo
     * @return
     */
    boolean isHit(InsuredInfo insuredInfo);

    /**
     * 基础保费试算
     * @param insuredInfo
     * @return
     */
    Integer compute(InsuredInfo insuredInfo);

    /**
     * 基础保费试算
     * @param insuredInfo
     * @return
     */
    Integer computeReal(InsuredInfo insuredInfo);



//    /**
//     * 根据折扣保费试算
//     * @param insuredInfo
//     * @return
//     */
//    FeeResult computeWithDiscount(InsuredInfo insuredInfo);
}
