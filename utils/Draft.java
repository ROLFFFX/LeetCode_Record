package utils;

import java.util.Stack;

public class Draft {
    public static void main(String[] args) {
//        String s = "a, a, a, a, b,b,b,c, c";
//        String[] arr = s.split("[!?',;. ]");
//        for (String i : arr) System.out.println(i);
        ifStack();
    }

    public static void ifStack(){
        Stack<Integer> stack = new Stack<>();
        if (stack.add(2)){
            System.out.println("added");
        }
        for (int num : stack) System.out.println(num);
    }
}
