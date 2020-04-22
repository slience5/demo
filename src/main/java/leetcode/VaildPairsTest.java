package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class VaildPairsTest {

    public static void main(String[] args) {
        System.out.println(isValid("()") == true);
        System.out.println(isValid("{[]}") == true);
        System.out.println(isValid("([)]") == false);
        System.out.println(isValid("(]") == false);
        System.out.println(isValid( "()[]{}") == true);
        System.out.println(isValid( "(])") == false);
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack stack = new Stack();

        char[] pairs = s.toCharArray();
        for (int i = 0; i < pairs.length; i++) {
            if(matchBack(pairs[i])){
                if(stack.empty()){
                    stack.push(pairs[i]);
                    continue;
                }else {
                    if(stack.peek().equals(map.get(pairs[i]))){
                        stack.pop();
                    }else {
                        stack.push(pairs[i]);
                    }
                }
            }else{
                stack.push(pairs[i]);
            }
        }

        return stack.empty();
    }

    private static boolean matchBack(char c){
        return c == '}' || c == ']' || c == ')';
    }
}
