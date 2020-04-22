package construct;

import com.google.common.collect.Lists;

import java.util.List;

public class StackTest<E> {
    
    
    private int msize = 0;
    
    private List<E> list = Lists.newArrayList();
    
    public StackTest() {}
    
    public void push(E e) {
        if(msize >= list.size()) {
           list.add(e);
        }else {
            list.set(msize, e);
        }
        msize++;
    }
    
    public E pop() {
        if(msize <= 0) {
            return null;
        }
        return list.get(--msize);
    }
    
    public E peek() {
        if(msize <= 0) {
            return null;
        }
        return list.get(msize-1);
    }
}
