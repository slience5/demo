package jdk8;

public class ClassInitTestPar {

    Integer a = initValue("父类普通全局变量a");

    static Integer aStic = initValue("父类静态变量a");

    static {
        System.out.println("父类静态代码块");
    }

    public ClassInitTestPar(){
        a = initValue("父类全局变量赋值");
    }

    public static Integer initValue(String str){
        System.out.println(str);
        return 2018;
    }

    public static void main(String[] args) {
        ClassInitTestPar classInitTest = new ClassInitTestPar();
    }
}
