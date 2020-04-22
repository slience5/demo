package jdk8;

public class ClassInitTest extends ClassInitTestPar{

    Integer a = initValue("普通全局变量a");

    static Integer aStic = initValue("静态变量a");

    static {
        System.out.println("静态代码块");
    }

    public ClassInitTest(){
        a = initValue("全局变量赋值");
    }

    public static Integer initValue(String str){
        System.out.println(str);
        return 2018;
    }

    public static void main(String[] args) {
        ClassInitTest classInitTest = new ClassInitTest();
    }
}
