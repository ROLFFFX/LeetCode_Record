package Easy;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(c);
            } else if (stack.peek() == c){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String ans = "";
        while (!stack.isEmpty()){
            ans = String.valueOf(stack.pop()) + ans;
        }
        return ans;
    }
}
