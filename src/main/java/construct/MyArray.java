package construct;

import java.util.concurrent.atomic.AtomicInteger;

public class MyArray<T>{

    private static final int BASE_SIZE = 16;

    private volatile Object[] tArys;

    private volatile int size;

    private AtomicInteger pos = new AtomicInteger(0);

    public void add(T t){
        if(tArys == null){
            initWithBaseSize();
        }else if(pos.get() > tArys.length - 1){
            moveAndFillNull();
            if(pos.get() > tArys.length - 1){
                enLarge();
            }
        }
        synchronized (tArys){
            tArys[pos.get()] = t;
            pos.incrementAndGet();
        }
    }

    public T get(int pos){
        if(pos > size - 1){
            throw new IndexOutOfBoundsException();
        }
        return (T)tArys[pos];
    }

    public T delete(int pos){
        if(pos > size - 1){
            throw new IndexOutOfBoundsException();
        }
        T t = (T)tArys[pos];
        tArys[pos] = null;
        return t;
    }

    private void initWithBaseSize(){
        if(tArys == null){
            synchronized (tArys){
                tArys = new Object[BASE_SIZE];
                size = BASE_SIZE;
                pos = new AtomicInteger(0);
            }
        }
    }

    private void enLarge(){
        int enSize = size * 2;
        Object[] obj = new Object[enSize];
        synchronized (tArys){
            for (int i = 0; i < size; i++) {
                obj[i] = tArys[i];
            }
            tArys = obj;
            size = enSize;
        }
    }

    private void moveAndFillNull(){
        Object[] backUp = new Object[size];
        int j = 0;
        synchronized (tArys){
            for (int i = 0; i < size - 1; i++) {
                if(tArys[i] != null){
                    backUp[j++] = tArys[i];
                }
            }
            tArys = backUp;
            pos.getAndSet(j);
        }
    }
}
