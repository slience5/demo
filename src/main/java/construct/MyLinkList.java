package construct;

public class MyLinkList {

    private Node head;

    private Node tail;

    private Node next;

    private Integer size;

    class Node{
        private  Object obj;
        private Node next;
        private Node pre;

        public Node(Object obj){
            this.obj = obj;
        }
    }

    public void add(Object obj){
        if(head == tail && size > 0){
            // 循环队列满
            return;
        }
        Node node = new Node(obj);
        next.next = node;
        node.pre = next;
        size ++;

        tail = node;
    }

    public void delete(int idx){
        if(head == tail && size == 0){
            // 循环队列为空
            return;
        }
        Node node = head;
        for (int i = 1; i < idx; i++) {
            node = node.next;
        }
        if(idx == size){// 尾节点
            node.pre.next = node.next;
        }else{// 中间节点
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        size--;
    }
}
