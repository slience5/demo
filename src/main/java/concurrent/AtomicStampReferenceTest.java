package concurrent;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampReferenceTest {

    public static void main(String[] args) {
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1,1);

        boolean result = atomicStampedReference.compareAndSet(2,2,3,3);

        System.out.println(result);

        System.out.println(atomicStampedReference.getReference());

        result = atomicStampedReference.compareAndSet(1,3,1,3);

        System.out.println(result);

    }
}
