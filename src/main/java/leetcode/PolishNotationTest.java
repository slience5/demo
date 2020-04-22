package leetcode;

import java.util.Stack;

public class PolishNotationTest {

    public int evalRPN(String[] tokens) {
         String plus = "+";
         String minus = "-";
         String divid = "/";
         String multi = "*";
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
           switch (token){
               case "+":
                   stack.push(plus(stack.pop(),stack.pop()));
                   break;
               case  "-":
                   String a = stack.pop();
                   stack.push(minus(stack.pop(),a));
                   break;
               case "*":
                   stack.push(multi(stack.pop(),stack.pop()));
                   break;
               case "/":
                   String b = stack.pop();
                   stack.push(divid(stack.pop(),b));
                   break;
                default:
                    stack.push(token);
           }
        }
        return Integer.parseInt(stack.get(0));
    }

    private String plus(String a,String b){
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    private String minus(String a,String b){
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    private String divid(String a,String b){
        return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
    }

    private String multi(String a,String b){
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }
}
