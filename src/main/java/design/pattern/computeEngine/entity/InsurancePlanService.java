package design.pattern.computeEngine.entity;

import com.google.common.collect.Lists;
import design.pattern.computeEngine.entity.InsurancePlanExtendDO;
import design.pattern.computeEngine.entity.InsurancePriceRuleDO;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
@Slf4j
public class InsurancePlanService {

    public List<InsurancePriceRuleDO> findRulesByPlanId(String planId) {
        InsurancePriceRuleDO priceRuleDO = new InsurancePriceRuleDO();
        priceRuleDO.setFeeType(InsuranceFeeTypeEnum.BY_SUIT.getCode());
        priceRuleDO.setAdditionalFee(100);
        priceRuleDO.setInsurancePlanId("test");
        priceRuleDO.setIsByAge(0);
        priceRuleDO.setStartTime(1);
        priceRuleDO.setEndTime(10);
        priceRuleDO.setAdditionalFeePeriod(1);
        priceRuleDO.setPrice(3000);
        priceRuleDO.setTimeMost(10);
        priceRuleDO.setTimeUnit(TimeUnitEnum.DAY.getCode());

        return Lists.newArrayList(priceRuleDO);
    }

    public InsurancePlanExtendDO findPlanExtendDOById(String planId) {
        InsurancePlanExtendDO extendDO = new InsurancePlanExtendDO();
        extendDO.setInsurancePlanId("test");
        extendDO.setPlatformDiscount(new BigDecimal("0.75"));
        return extendDO;
    }
}
