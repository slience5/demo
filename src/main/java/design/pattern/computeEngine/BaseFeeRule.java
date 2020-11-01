package design.pattern.computeEngine;

import design.pattern.computeEngine.entity.InsuredInfo;
import design.pattern.computeEngine.entity.TimeUnitEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * 计费规则基础类
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-29
 **/
@Data
public class BaseFeeRule implements InsuranceFeeRule{
    /**
     * 保险计划id
     */
    protected String insurancePlanId;

    /**
     * 是否按照年龄配置
     */
    protected Integer isByAge;

    /**
     * 起始年龄
     */
    protected Integer startAge;

    /**
     * 终止年龄
     */
    protected Integer endAge;

    /**
     * 起始年龄单位
     */
    protected String startAgeUnit;

    /**
     * 终止年龄单位
     */
    protected String endAgeUnit;

    /**
     * 起始时间
     */
    protected Integer startTime;

    /**
     * 终止时间
     */
    protected Integer endTime;

    /**
     * 时间单位
     * @see com.daze.visa.base.enums.insurance.TimeUnitEnum
     */
    protected String timeUnit;

    /**
     * 计费最大时间
     */
    protected  Integer timeMost;

    /**
     * 价格（分）
     */
    protected Integer price;

    /**
     * 附加费（分）
     */
    protected Integer additionalFee;

    /**
     * 附加费计费周期
     */
    protected Integer additionalFeePeriod;

    /**
     * 排序字段
     */
    protected Integer dIndex;

    /**
     * 平台折扣
     */
    protected BigDecimal platformDiscount;

    /**
     * 商家折扣
     */
    protected BigDecimal merchantDiscount;

    private static final DateTimeFormatter FORMATTER =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 根据生日判断年龄是否符合要求
     * @param birthday
     * @return
     */
    public boolean isAgeHit(Date birthday) {
        LocalDate birthDate = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // 当天出生算一天 范围需要前后扩大一天
        LocalDate startDate = getMinusDate(endAge,endAgeUnit).minusDays(1);
        LocalDate endDate = getMinusDate(startAge,startAgeUnit).plusDays(1);

        return birthDate.isAfter(startDate) && birthDate.isBefore(endDate);
    }

    /**
     * 根据单位转换对应日期
     *
     * @param time
     * @param timeUnit
     * @return
     */
    private static LocalDate getMinusDate(Integer time, String timeUnit) {
        switch (TimeUnitEnum.of(timeUnit)) {
            case DAY:
                return LocalDate.now().minusDays(Long.valueOf(time));
            case MONTH:
                return LocalDate.now().minusMonths(Long.valueOf(time));
            case YEAR:
                return LocalDate.now().minusYears(Long.valueOf(time));
            default:
//                throw new Exception("不支持的时间单位");
                return null;
        }
    }


//    /**
//     *
//     * 计算商家折扣保费
//     *
//     * @param baseFee
//     * @return
//     */
//    public Integer computeMerchantFee(Integer baseFee){
//        return merchantDiscount.multiply(BigDecimal.valueOf(baseFee)).intValue();
//    }

    /**
     * 计算平台折扣保费
     * @param baseFee
     * @return
     */
    public Integer computePlatformFee(Integer baseFee){
        return platformDiscount.multiply(BigDecimal.valueOf(baseFee)).intValue();
    }


//    public static void main(String[] args) {
////        System.out.println(getDays(2,"month"));
////        System.out.println(getDays(2,"year"));
//
//        BaseFeeRule baseFeeRule = new BaseFeeRule();
//        baseFeeRule.setStartAge(1);
//        baseFeeRule.setStartAgeUnit("month");
//        baseFeeRule.setEndAge(10);
//        baseFeeRule.setEndAgeUnit("year");
//
//        System.out.println(baseFeeRule.isAgeHit("2019-07-30"));
//    }

    @Override
    public boolean isHit(InsuredInfo insuredInfo) {
        return false;
    }

    @Override
    public Integer compute(InsuredInfo insuredInfo) {
        return null;
    }

    @Override
    public Integer computeReal(InsuredInfo insuredInfo) {
        return compute(insuredInfo);
    }

    public FeeResult computeWithDiscount(InsuredInfo insuredInfo) {
        Integer baseFee = compute(insuredInfo);
        if(baseFee != null){
            FeeResult feeResult = new FeeResult();
            feeResult.setOriginFee(baseFee);
            feeResult.setMerchantInsuranceFee(computeReal(insuredInfo));
//            feeResult.setPlatformInsuranceFee(computePlatformFee(baseFee));
            return feeResult;
        }
        return null;
    }
}
