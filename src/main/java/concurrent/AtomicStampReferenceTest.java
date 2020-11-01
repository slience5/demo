package concurrent;

import com.google.common.collect.Maps;

import javax.swing.*;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 带版本戳的CAS
 * 可以解决CAS的ABA问题
 *
 * stamp 版本戳
 * reference 引用
 */
public class AtomicStampReferenceTest {

    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1,1);
//
//        boolean result = atomicStampedReference.compareAndSet(2,2,3,3);
//
//        System.out.println(result);
//
//        System.out.println(atomicStampedReference.getReference());
//
//        result = atomicStampedReference.compareAndSet(1,3,1,3);
//
//        System.out.println(result);

        Map<String,Integer> map = Maps.newHashMap();
        map.put("A",1);

        action(map);
    }

    private static void action(Map<String, Integer> map) throws ExecutionException, InterruptedException {
        Future<Integer> future = executorService.submit(() -> map.get("A"));
        Integer value = future.get();
        System.out.println(value == 1);
    }

}

