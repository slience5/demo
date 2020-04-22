package concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentranLockTest {

    public static void main(String[] args) {
        String name = "";
        ReentrantLock lock = new ReentrantLock();

        Thread thread = new Thread(new Worker(lock,name));

        Thread thread2 = new Thread(new Worker1(lock,name));

        thread.start();
        thread2.start();

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static class Worker implements Runnable{
        public ReentrantLock lock;
        public String name;

        public  Worker(ReentrantLock lock,String name) {
            this.name = name;
            this.lock = lock;
        }

        @Override
        public void run() {
            System.out.println("worker try lock ");
            lock.lock();
            System.out.println("worker success");
            try {
                Thread.sleep(2000);
                synchronized (lock){
                    lock.wait();
                }
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker1 implements Runnable{
        public ReentrantLock lock;
        public String name;

        public  Worker1(ReentrantLock lock,String name) {
            this.name = name;
            this.lock = lock;
        }

        @Override
        public void run() {
            System.out.println("worker1 try lock ");
            if(lock.tryLock()){
                System.out.println("worker1 try lock success");
            }else{
                System.out.println("worker1 try lock fail");
            }
            try {
                Thread.sleep(5000);
                synchronized (lock){
                    lock.notify();
                }
                System.out.println("worker lock ");
                lock.lock();
                System.out.println("worker success");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
