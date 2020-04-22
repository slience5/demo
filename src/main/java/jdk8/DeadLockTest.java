package jdk8;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockTest {

    private static List<Integer> list = Lists.newArrayList();

    private static List<Integer> list1 = Lists.newArrayList();

    private static final ExecutorService excutorService = Executors.newFixedThreadPool(2);

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        excutorService.execute(()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (list){
                System.out.println("start 1");
                list.add(1);
                synchronized (list1){
                    list1.add(1);
                }
            }
            System.out.println("end 1");
        });


        excutorService.execute(()->{
            countDownLatch.countDown();
            synchronized (list1) {
                System.out.println("start 2");
                list1.add(1);
                synchronized (list) {
                    list.add(1);
                }
            }
            System.out.println("end 2");
        });
    }
}
