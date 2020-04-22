package design.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒加载 线程安全 序列化，序列化和反序列化的问题 反射破坏构造器私有属性
 * 
 * @author jinlei
 *
 */
public class SingleInstance {

    private SingleInstance singleInstance;

    String name;


    private SingleInstance() {
        this.name = "reflect";
    }


    private SingleInstance(String name) {
        this.name = name;
    }

    private static class SingleInstanceInner {
        private static final SingleInstance SINGLE_INSTANCE = new SingleInstance("111");
    }


    public static SingleInstance getInstance() {
        return SingleInstanceInner.SINGLE_INSTANCE;
    }


    public SingleInstance getInstanceByJudge() {
        if (singleInstance == null) {
            singleInstance = new SingleInstance("bbb");
        }
        return singleInstance;
    }


    public SingleInstance getInstanceByLock() {
        if (singleInstance == null) {
            synchronized (singleInstance) {
                if (singleInstance == null) {
                    singleInstance = new SingleInstance("ccc");
                }
            }
        }

        return singleInstance;
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Constructor[] constructors = SingleInstance.class.getDeclaredConstructors();
        constructors[1].setAccessible(true);

        SingleInstance singleInstance2 = (SingleInstance) constructors[1].newInstance("ddd");

        System.out.println(singleInstance2.name);

    }
}
