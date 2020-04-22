package concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        CountDownLatch countDownLatch = new CountDownLatch(n);
        
        for (int i=0;i<n;i++) {
            new Thread(new Worker(countDownLatch)).start();
        }
        
        countDownLatch.await();
        System.out.println(countDownLatch.getCount());
        
        System.out.println("await end...");
    }
    
  static class Worker implements Runnable{
        private final CountDownLatch countDownLatch;
        
        public  Worker(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            doWork();
            System.out.println(countDownLatch.getCount());
            countDownLatch.countDown();
            System.out.println(countDownLatch.getCount());
        }
        
        void doWork() {
            System.out.println("doing work....");
        }
        
    }
}
