package concurrent;

import org.checkerframework.checker.units.qual.C;
import sun.rmi.runtime.Log;

import java.sql.SQLOutput;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {

    public static void main(String[] args) {
        String name = "";
        ReentrantLock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();

        Thread thread = new Thread(new Worker(lock,condition,name));

        Thread thread2 = new Thread(new Worker1(lock,condition,name));

        thread.start();
        thread2.start();

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static class Worker implements Runnable{
        private ReentrantLock reentrantLock;
        public  Condition condition;
        public String name;

        public  Worker(ReentrantLock reentrantLock,Condition condition,String name) {
            this.reentrantLock = reentrantLock;
            this.condition = condition;
            this.name = name;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {
                System.out.println("worker wait");
                condition.await();
                System.out.println("worder wakeUp");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }

    static class Worker1 implements Runnable{
        private ReentrantLock reentrantLock;
        public Condition condition;
        public String name;

        public  Worker1(ReentrantLock reentrantLock,Condition condition,String name) {
            this.reentrantLock = reentrantLock;
            this.condition = condition;
            this.name = name;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {
                Thread.sleep(1000);
                System.out.println("worker1 notify");
                condition.signal();
                System.out.println("worker1 end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
