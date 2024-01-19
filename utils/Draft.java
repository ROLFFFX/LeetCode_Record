package utils;

public class Draft {
    public static void main(String[] args) {
        String s = "a, a, a, a, b,b,b,c, c";
        String[] arr = s.split("[!?',;. ]");
        for (String i : arr) System.out.println(i);
    }
}
