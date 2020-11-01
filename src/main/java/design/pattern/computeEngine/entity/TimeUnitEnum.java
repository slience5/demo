package design.pattern.computeEngine.entity;

/**
 * 时间单位枚举
 *
 * @author jinlei
 */
public enum TimeUnitEnum {
    /**
     * 秒
     */
    SECOND("second"),
    /**
     * 分
     */
    MINUTE("minute"),

    /**
     * 时
     */
    HOUR("hour"),

    /**
     * 日
     */
    DAY("day"),

    /**
     * 月
     */
    MONTH("month"),

    /**
     * 年
     */
    YEAR("year");

    private String code;

    TimeUnitEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static TimeUnitEnum of(String code){
        switch (code){
            case "day":
                return DAY;
            case "month":
                return MONTH;
            case "year":
                return YEAR;
            case "hour":
                return HOUR;
            case "minute":
                return MINUTE;
            case "second":
                return SECOND;
            default:
                return null;
        }
    }
}
