package leetcode;

import org.apache.commons.lang.StringUtils;

import java.util.LinkedList;

public class RotateStringTest {

    
    public static void main(String[] args) {
        System.out.println(rotateString("fzjajzaarztbuszlyfjtbfdcypglakelbwirvaijycqdhdfurs","arztbuszlyfjtbfdcypglakelbwirvaijycqdhdfursfzjajza"));
    }
    
    public static boolean rotateString(String A,String B) {
        if(A.length() != B.length()) {
            return false;
        }
        if(StringUtils.isEmpty(A) && StringUtils.isEmpty(B)) {
            return true;
        }
        
        
        char[] aChar = A.toCharArray();
        char[] bChar = B.toCharArray();
        
        while(bChar[0] == bChar[B.length()-1]) {
           System.arraycopy(bChar, 0, bChar, 1, bChar.length-1);
           bChar[0] = bChar[1];
        }
       
        
        return compareResult(aChar, bChar, 0);
    }
    
    private static boolean compareResult(char[] a,char[] b,int count) {
        if(count > a.length) {
            return false;
        }
        
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0; i<count; i++) {
            list.add(a[i]);
        }
        
        int bCount = 0;
        boolean flag = false;
        for(int j=count; j<a.length; j++) {
            if(a[j] == b[bCount]) {
                flag = true;
                bCount++;
            }else {
                if(flag) {
                    return compareResult(a, b, j);
                }
                list.add(a[j]);
            }
        }
        
        if(bCount <= a.length-1) {
            for(int j=bCount; j<a.length; j++) {
                Character c = list.removeFirst();
                if(c != b[j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
