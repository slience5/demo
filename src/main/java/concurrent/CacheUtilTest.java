package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CacheUtilTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(20);
        CacheUtil cacheUtil = new CacheUtil();

        // 并发20个线程
        for (int i = 0; i < 20; i++) {
            new Thread(new Worker(cacheUtil,cyclicBarrier)).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cacheUtil.get("key", CacheUtil.Param.class));
    }


    static class Worker implements Runnable{

        CacheUtil cacheUtil;

        CyclicBarrier cyclicBarrier;

        public Worker(CacheUtil cacheUtil,CyclicBarrier cyclicBarrier){
            this.cacheUtil = cacheUtil;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

            CacheUtil.Param param = new CacheUtil.Param();
            param.setParam0("1");
            param.setParam1("2");
            param.setParam2("3");
            param.setParam3("4");
            cacheUtil.set("key",param,p -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return p;
            } ,1000);
        }
    }
}
