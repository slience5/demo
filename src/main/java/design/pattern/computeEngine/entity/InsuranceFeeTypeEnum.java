package design.pattern.computeEngine.entity;

/**
 * 保险计费类型
 *
 * @author jinlei
 */
public enum InsuranceFeeTypeEnum {
    /**
     * 按天计费
     */
    BY_DAY(1),
    /**
     * 按月计费
     */
    BY_MONTH(2),

    /**
     * 按年计费
     */
    BY_YEAR(3),

    /**
     * 按套餐计费
     */
    BY_SUIT(4);

    private Integer code;

    InsuranceFeeTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static InsuranceFeeTypeEnum of(Integer code){
        switch (code){
            case 1:
                return BY_DAY;
            case 2:
                return BY_MONTH;
            case 3:
                return BY_YEAR;
            case 4:
                return BY_SUIT;
            default:
                return null;
        }
    }

}
