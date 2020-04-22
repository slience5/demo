package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Math.max;

public class LongestPairs {

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()") == 2);
        System.out.println(longestValidParentheses(")()())") == 4);
        System.out.println(longestValidParentheses("()(()") == 2);
        System.out.println(longestValidParentheses("()(())") == 6);
        System.out.println(longestValidParentheses("(()()") == 4);
    }

    public static int longestValidParentheses(String s) {
        char pairA = '(';
        char pairB = ')';

        Stack stack = new Stack();

        List<Integer> results = new ArrayList<>();


        char[] pairs = s.toCharArray();
        for (int i = 0; i < pairs.length; i++) {
            if(stack.empty() || pairs[i] == pairA){
                stack.push(pairs[i]);
                continue;
            }
            if(pairs[i] == pairB){
                if(stack.peek().equals(pairA)){
                    stack.pop();
                }else{
                    stack.push(pairs[i]);
                }
            }

        }

        int count = 0;
        if (stack.empty()) {
            count = s.length();
        }
        else {
            int a = s.length(), b = 0;
            while (!stack.empty()) {
                b = stack.capacity(); stack.pop();
                count = max(count, a-b-1);
                a = b;
            }
            count = max(count, a);
        }
        return count;
}
}
