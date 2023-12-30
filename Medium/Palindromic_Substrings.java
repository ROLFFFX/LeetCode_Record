package Medium;

import java.util.ArrayList;
import java.util.List;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        Palindromic_Substrings solution = new Palindromic_Substrings();
        System.out.println(solution.countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        // get all substrings of string s
        List<String> subStrings = generateSubstrings(s);
        int count = 0;
        for (String subString : subStrings){
            if (isPalindrome(subString)){
                count++;
            }
        }
        return count;
    }
    
    // helper function that checks if string s is palindrome
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static List<String> generateSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        int length = s.length();
        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                substrings.add(s.substring(start, end));
            }
        }
        return substrings;
    }
}
