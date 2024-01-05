package Easy;

import java.util.Stack;

public class BackSpace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack();
        Stack<Character> t_stack = new Stack();
        for (char c: s.toCharArray()){
            if (c == '#'){
                if (!s_stack.isEmpty()){
                    s_stack.pop();
                }

            } else {
                s_stack.push(c);
            }
        }
        for (char d: t.toCharArray()){
            if (d == '#'){
                if (!t_stack.isEmpty()){
                    t_stack.pop();
                }

            } else {
                t_stack.push(d);
            }
        }
        // compare two stacks
        return s_stack.equals(t_stack);
    }
}
