package design.pattern;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerTest {

    static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);

    private static final ExecutorService excutorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        excutorService.execute(()->{
            try {
                while(true){
                    Thread.sleep(1000);
                    blockingQueue.put("111");
                    System.out.println("生产！！！！！！！！！！！");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        excutorService.execute(()->{
            try {
                while(true){
                  blockingQueue.take();
                  System.out.println("消费者11111111111111111111");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        excutorService.execute(()->{
            try {
                while(true){
                    blockingQueue.take();
                    System.out.println("消费者22222222222222222222");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
