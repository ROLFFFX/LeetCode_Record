package Easy;

import java.util.Stack;

public class ValidParentheses_6_20 {
    public static void main(String[] args) {
        System.out.println(isValid("({[)}]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}


/** First Attempt**/
//    public static boolean isValid(String s) {
//        ArrayList arr = new ArrayList();
//        ArrayList arr_copy = new ArrayList();
//        for (int i = 0; i < s.length(); i++) {
//            arr.add(s.charAt(i));
//            arr_copy.add(s.charAt(i));
//        }
//
//        for (int i = 0; i < arr_copy.size(); i++) {
//            char x = s.charAt(i);
//            for (int j = i+1; j < arr_copy.size(); j++) {
//                char y = s.charAt(j);
//
//                if (pair(x,y)){
//                    arr.remove(arr.indexOf(y));
//                    arr.remove(arr.indexOf(x));
//                    break;
//                }
//            }
//        }
//        if (arr.isEmpty()){
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean pair(char x, char y){
//        if (x == '(' && y == ')') return true;
//        else if (x =='{' && y == '}') return true;
//        else if (x == '[' && y ==']') return true;
//        return false;
//    }
