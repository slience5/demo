package design.pattern.computeEngine.entity;

import cn.hutool.core.date.DateUtil;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 *
 * 投保信息
 *
 * @Author jinlei
 * @Description
 * @Date 2019-08-29
 **/
@Data
public class InsuredInfo {
    /**
     * 保险计划id
     */
    private String insurancePlanId;

    /**
     * 被保险人唯一编号
     */
    private String uniqueId;

    /**
     * 被保险人姓名
     */
    private String name;

    /**
     * 被保险人出生日期
     */
    private Date birthday;

    /**
     * 起保日期
     */
    private Date startDate;

    /**
     * 终保日期
     */
    private Date endDate;

    /**
     * 获取投保天数
     * @return
     */
    public Integer getInsurancePeriods(String timeUnit) {
        if(TimeUnitEnum.DAY.getCode().equals(timeUnit)){
            return Integer.parseInt(String.valueOf(DateUtil.betweenDay(endDate, startDate,true))) + 1;
        }else {
            return null;
//            throw new Exception("暂不支持其他时间单位");
        }
    }

    /**
     * 投保人信息简单校验
     * @return
     */
    public boolean insuredInfoCheck() throws Exception {
        if(StringUtils.isEmpty(getInsurancePlanId())){
            throw new Exception("保险计划id不能为空");
        }

        if(StringUtils.isEmpty(getInsurancePlanId())){
            throw new Exception("被保险人生日不能为空");
        }

        return true;
    }
}
