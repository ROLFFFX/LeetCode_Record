package Medium;

import java.util.ArrayList;
import java.util.List;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        Palindromic_Substrings solution = new Palindromic_Substrings();
        System.out.println(solution.countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=extractPalindrome(s,i,i);//odd length
            count+=extractPalindrome(s,i,i+1);//even length
        }
        return count;
    }
    public int extractPalindrome(String s, int left, int right){
        int count=0;
        while(left>=0 && right<s.length()&& (s.charAt(left)==s.charAt(right))){
            left--;
            right++;
            count++;
        }
        return count;
    }

    /** Worked but so slow **/
//    public static int countSubstrings(String s) {
//        // get all substrings of string s
//        List<String> subStrings = generateSubstrings(s);
//        int count = 0;
//        for (String subString : subStrings){
//            if (isPalindrome(subString)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // helper function that checks if string s is palindrome
//    public static boolean isPalindrome(String s){
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j){
//            if (s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
//
//    public static List<String> generateSubstrings(String s) {
//        List<String> substrings = new ArrayList<>();
//        int length = s.length();
//        for (int start = 0; start < length; start++) {
//            for (int end = start + 1; end <= length; end++) {
//                substrings.add(s.substring(start, end));
//            }
//        }
//        return substrings;
//    }
}
