package Easy;

import java.util.Stack;

public class Baseball_Game {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for (String op : operations){
            switch (op){
                case "+":
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(b);
                    stack.push(a);
                    stack.push(a+b);
                    break;
                case "D":
                    int c = Integer.valueOf(stack.pop());
                    stack.push(c);
                    stack.push(2 * c);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    break;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
