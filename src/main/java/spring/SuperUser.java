package spring;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class SuperUser extends User{

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
