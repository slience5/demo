package construct;

import com.google.common.collect.Maps;
import com.souche.optimus.common.util.StringUtil;

import java.util.Map;

public class CaculatorTest {
    
    private static Map<Character, Integer> map = Maps.newHashMap();
    
    static {
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('(',0);
        map.put(')',3);
    }

    public static void main(String[] args) {
        String testStr = "3-5*(4-2)-1";
        System.out.println(caculate(testStr));
    }
    
    public static Integer caculate(String str) {
        String symbols = "+-*/()";
        
        if(StringUtil.isEmpty(str)) {
            return null;
        }
        StackTest<Integer> numStack = new StackTest<>();
        StackTest<Character> charStack = new StackTest<>();
        
        int count = 0; 
        while(count < str.length()) {
             char  c = str.charAt(count);
            if(symbols.contains(String.valueOf(c))) {
                if(charStack.peek() == null || '(' == c ||  map.get(c) > map.get(charStack.peek())) {
                    charStack.push(c);
                }else {
                    if(')' == charStack.peek()) {
                        charStack.pop();
                        while (charStack.peek() != '(') {
                            Character character = charStack.pop();
                            Integer numA = numStack.pop();
                            Integer numB = numStack.pop();
                            
                            Integer result = caculate(numA,numB,character);
                            numStack.push(result);
                        }
                        if(charStack.peek() == '(') {
                            charStack.pop();
                        }
                }else {
                    Character character = charStack.pop();
                    Integer numA = numStack.pop();
                    Integer numB = numStack.pop();
                    
                    Integer result = caculate(numA,numB,character);
                    numStack.push(result);
                }
                count--;
               }
            }else {
                numStack.push(Integer.valueOf(String.valueOf(c)));
            }
            count++;
        }
        
        while(charStack.peek() != null) {
            Character character = charStack.pop();
            Integer numA = numStack.pop();
            Integer numB = numStack.pop();
            
            Integer result = caculate(numA,numB,character);
            numStack.push(result);
        }
        
        return numStack.peek();
    }
    
    private static Integer caculate(Integer a,Integer b,Character c) {
        if('+' == c) {
            return a + b;
        }else if('-' == c) {
            return b - a;
        }else if('*' == c) {
            return a * b;
        }else if('/' == c) {
            return b / a;
        }
        return 0;
    }
}
