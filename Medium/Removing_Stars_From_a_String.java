package Medium;

import java.util.Stack;
import java.util.stream.Collectors;

public class Removing_Stars_From_a_String {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        for (char c:s.toCharArray()){
            switch (c){
                case '*':
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(c);
            }
        }
        return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));
    }
}
