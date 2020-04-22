package leetcode;

public class MyCircularDeque {

   Integer[] ary;

   private Integer size = 16;

   private Integer capacity = 0;

   private int head = size - 1;
   private int tail = size - 1;


    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        size = k;
        head = tail = k - 1;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        checkIfNull();
        if(capacity.equals(size)){
            return false;
        }
        addVal(head,value);
        head--;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        checkIfNull();
        if(capacity.equals(size)){
            return false;
        }
        addVal(tail,value);
        tail++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(ary == null || capacity == 0){
            return false;
        }
        removeVal(head++);
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(ary == null || capacity == 0){
            return false;
        }
        removeVal(tail--);
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(capacity == 0){
            return -1;
        }
        int idx = head + 1;
        return ary[idx];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(capacity == 0){
            return -1;
        }
        int idx = tail - 1;
        return ary[idx];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return capacity == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return  capacity.equals(size);
    }

    private void checkIfNull(){
        if(ary == null){
            ary = new Integer[size * 2];
        }
    }

    private void addVal(int idx,int value){
        ary[idx] = value;
        capacity++;
    }

    private void removeVal(int idx){
        ary[idx] = null;
        capacity--;
    }
}
