package construct;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

public class LinkedTest {
    
    public static void main(String[] args) {
        Map<Test, String> map = Maps.newHashMap();
        map.put(new Test(), "2");
        
        
       ListNode node1 = new ListNode(0);
       node1.next = new ListNode(1);
       node1.next.next = new ListNode(3);
       ListNode node2 = new ListNode(0);
       node2.next = new ListNode(2);
       node2.next.next = new ListNode(3);
//       temp = node1;
//       int i =1;
//       while(i<5) {
//           temp.next = new ListNode(String.valueOf(i));
//           temp = temp.next;
//           i++;
//       }
       
       System.out.println(mergeTwoLists(node1,node2));
//       temp.next = node1;
//       
//       
//       System.out.println(isCycle(node1));
//       
//       ListNode reverserNode = reverseList(node1);
//       while(reverserNode != null) {
//           System.out.println(reverserNode.value);
//           reverserNode = reverserNode.next;
//       }
        
    }

    
    @Data
    @EqualsAndHashCode(exclude= "next")
    static class ListNode{
        
        int val;
        
        ListNode next;
        
        ListNode(int value){
            this.val = value;
        }
    }
    
    @Data
    static class Test{
        String name;
        String age;
    }
    
    
    public static ListNode reverseList(ListNode node) {
        ListNode lastNode = new ListNode(node.val);
        
        ListNode tail = lastNode;
        while(node.next != null) {
            ListNode node2 = new ListNode(node.next.val); 
            node2.next = tail;
            tail = node2;
            node = node.next;
        }
        
        return tail;
    }
    
    public static boolean isCycle(ListNode node) {
        if(node.next == node) {
            return true;
        }
        
        Map<ListNode, Integer> map = Maps.newHashMap();
        map.put(node, node.val);
        while(node.next != null) {
            if(map.get(node.next) != null) {
                return true;
            }
            node = node.next;
            map.put(node, node.val);
        }
        
        return false;
    }
    
    public static ListNode middleNode(ListNode head) {
        int i = 1;
        ListNode count = head;
        while(count != null && count.next != null) {
            i++;
            count = count.next;
        }
        
        i = i / 2;
        int j = 0;
        ListNode temp = head;
        while(j < i) {
            temp = temp.next;
            j++;
        }
        
        return temp;
    }
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 1;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            i++;
            temp = temp.next;
        }
        
        int delePos = i - n - 1;
        if(delePos == -1){
            return head.next;
        }
        
        int j = 0;
        temp = head;
        while(temp != null && temp.next != null){
            if(j == delePos){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            j++;
        }
        return head;
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;
        
        ListNode temp = new ListNode(1);
        
        ListNode head = temp;
        while(left != null && right != null) {
            if(left.val < right.val) {
                temp.next = new ListNode(left.val);
                temp = temp.next;
                left = left.next;
            }else if(left.val > right.val) {
                temp.next = new ListNode(right.val);
                temp = temp.next;
                right = right.next;
            }else if (left.val == right.val) {
                temp.next = new ListNode(left.val);
                temp.next.next = new ListNode(right.val);
                temp = temp.next.next;
                left = left.next;
                right = right.next;
            }
        }
        
        while(left != null) {
            temp.next = new ListNode(left.val);
            temp = temp.next;
            left = left.next;
        }
        
        while(right != null) {
            temp.next = new ListNode(right.val);
            temp = temp.next;
            right = right.next;
        }
        
        return head.next;
        
        
    }
    
    
}
