package Medium;

import java.util.Stack;

public class Valid_Parenthesis_String {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack();
        Stack<Integer> star = new Stack();
        // storing the indices and consume right brackets on the fly
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++){
            char c = arr[i];
            if (c == '(') open.push(i);
            else if (c == '*') star.push(i);
            else {
                // if left bracket
                if (!open.isEmpty()) open.pop();
                else if (!star.isEmpty()) star.pop();
                else return false;
            }
        }

        while (!open.isEmpty() && !star.isEmpty()) {
            if (open.pop() > star.pop()) return false;
        }
        return open.isEmpty();
    }
}
