package concurrent;


import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerTest {
    private static Exchanger<String> exchanger = new Exchanger<>();

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        executorService.execute(() -> {
           String A = "ceshizifuchuanA";
            try {
                exchanger.exchange(A);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            String B = "ceshizufuchuanA";
            try {
                String A = exchanger.exchange(B);
                System.out.println(A);
                System.out.println(A.equals(B));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            String C = "ceshizufuchuanA";
            try {
                String A = exchanger.exchange(C);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            String C = "ceshizufuchuanA";
            try {
                String A = exchanger.exchange(C);
                System.out.println(A);
                System.out.println(A.equals(C));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
