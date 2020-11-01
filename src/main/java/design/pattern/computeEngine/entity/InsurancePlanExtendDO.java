package design.pattern.computeEngine.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * insurance_plan_extend
 * @author 
 */
@Data
public class InsurancePlanExtendDO implements Serializable {
    private Long id;

    /**
     * 保险计划分类id
     */
    private String insurancePlanId;

    /**
     * 平台折扣
     */
    private BigDecimal platformDiscount;

    /**
     * 商家折扣
     */
    private BigDecimal merchantDiscount;

    /**
     * 自定义标签
     */
    private String tags;

    private Date gmtCreate;

    private Date gmtModify;

    /**
     * 操作人id
     */
    private Integer operator;

    private Integer deleted;

    private static final long serialVersionUID = 1L;
}