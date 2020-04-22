package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    
    public static void main(String[] args) {
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,()-> {
            try {
                System.out.println("阶段完成，等待2秒...");
                Thread.sleep(2000);
                System.out.println("进入下个阶段...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread player1 = new Thread(new Player("player1", cyclicBarrier));
        
        Thread player2 = new Thread(new Player("player2", cyclicBarrier));
        
        Thread player3 = new Thread(new Player("player3", cyclicBarrier));
        
        player1.start();
        
        player2.start();
        
        player3.start();
    }

    
    static class Player implements Runnable{

        CyclicBarrier cyclicBarrier;
        
        String name;
        
        public  Player(String name,CyclicBarrier cyclicBarrier) {
           this.name = name;
           this.cyclicBarrier = cyclicBarrier;
        }
        
        @Override
        public void run() {
            try {
                System.out.println("开始匹配玩家...");
                findOtherPlayer();
                cyclicBarrier.await();
                System.out.println(cyclicBarrier.await());
                
                System.out.println("开始选择角色...");
                chooseRoles();
                cyclicBarrier.await();
                System.out.println(cyclicBarrier.await());

                
                System.out.println("加载游戏...");
                loading();
                cyclicBarrier.await();
                System.out.println(cyclicBarrier.await());

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
           
           
        }
        
        void findOtherPlayer() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        void chooseRoles() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        void loading() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
        
        
    } 
}
