package concurrent;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {

    static  ExecutorService myThreadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception{
        FutureTask<Integer> futureTask = new FutureTask<>(new Task());

        List<Future> list = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            Future<Integer> result = myThreadPool.submit(new Task());
            list.add(result);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get());
        }
    }

    static class Task implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }

}
