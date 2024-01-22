package Easy;

public class Remove_Palindromic_Subsequences {
    public int removePalindromeSub(String s) {
        String a = new StringBuilder(s).reverse().toString();
        if (s.equals(a)) return 1;
        return 2;
    }
}
