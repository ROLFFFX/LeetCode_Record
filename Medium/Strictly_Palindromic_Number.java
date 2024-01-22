package Medium;

public class Strictly_Palindromic_Number {
    public boolean isStrictlyPalindromic(int n) {
        return Integer.toBinaryString(n) == new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
    }
}
