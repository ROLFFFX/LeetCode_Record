package Medium;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String s : tokens){
            switch (s) {
                case "+": int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-": int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y - x);
                    break;
                case "*": int c = stack.pop();
                    int d = stack.pop();
                    stack.push(c * d);
                    break;
                case "/": int o = stack.pop();
                    int p = stack.pop();
                    stack.push(p / o);
                    break;
                default: stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
