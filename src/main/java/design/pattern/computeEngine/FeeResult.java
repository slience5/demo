package design.pattern.computeEngine;

import lombok.Data;

/**
 * @Author jinlei
 * @Description
 * @Date 2019-09-10
 **/
@Data
public class FeeResult {

    /**
     * 原保费
     */
    private Integer originFee;

    /**
     * 商家折扣保费 = 原保费 * 商家折扣
     */
    private Integer merchantInsuranceFee;

    /**
     * 平台折扣保费 = 原保费 * 平台折扣
     */
    private Integer platformInsuranceFee;

}
