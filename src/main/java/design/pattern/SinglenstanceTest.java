package design.pattern;


/**
 * 饿汉式 反射 及 非懒加载资源问题
 * 双检锁
 */
public class SinglenstanceTest {

    private static SinglenstanceTest singletancetest;

    private SinglenstanceTest(){

    }

    private static class SinglenstanceTestInstance{
        private static final SinglenstanceTest singlenstance = new SinglenstanceTest();
    }

    public static SinglenstanceTest getInstance(){
        return SinglenstanceTestInstance.singlenstance;
//       if(singletancetest == null){
//           synchronized (singletancetest){
//               if(singletancetest == null){
//                   singletancetest = new SinglenstanceTest();
//               }
//           }
//       }
//       return singletancetest;
    }
}


