package design.pattern.computeEngine.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * insurance_price_rule
 * @author 
 */
@Data
public class InsurancePriceRuleDO implements Serializable {
    private Long id;

    /**
     * 保险计划id
     */
    private String insurancePlanId;

    /**
     * 是否按照年龄配置
     */
    private Integer isByAge;

    /**
     * 计费方式
     */
    private Integer feeType;

    /**
     * 起始年龄
     */
    private Integer startAge;

    /**
     * 终止年龄
     */
    private Integer endAge;

    /**
     * 起始年龄单位
     */
    private String startAgeUnit;

    /**
     * 终止年龄单位
     */
    private String endAgeUnit;

    /**
     * 起始时间
     */
    private Integer startTime;

    /**
     * 终止时间
     */
    private Integer endTime;

    /**
     * 时间单位
     */
    private String timeUnit;

    /**
     * 价格（分）
     */
    private Integer price;

    /**
     * 附加费（分）
     */
    private Integer additionalFee;

    /**
     * 附加费计费周期
     */
    private Integer additionalFeePeriod;

    /**
     * 计费最大天数
     */
    private Integer timeMost;

    /**
     * 排序字段
     */
    private Integer dindex;

    /**
     * 操作人
     */
    private Integer operator;

    private Date gmtCreate;

    private Date gmtModify;

    /**
     * 删除标记
     */
    private Integer deleted;

    private static final long serialVersionUID = 1L;
}