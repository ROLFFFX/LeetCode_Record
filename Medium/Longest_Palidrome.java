package Medium;

public class Longest_Palidrome {
    public static void main(String[] args) {
        String s = "bba";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }

    public static String longestPalindrome(String s) {
        return s;
    }


        /** First Attempt Not success. **/
//    public static String longestPalindrome(String s) {
//        if (s.length() == 1){ return s; }
//        if (s.length() == 2){
//            if (s.charAt(0) == s.charAt(1)){
//                return s;
//            }
//            return String.valueOf(s.charAt(0));
//        }
//        String ans = String.valueOf(s.charAt(0));
//        int max_len = 1;
//        for (int i = 0; i < s.length() - 1; i++) {
//            int i_cpy = i;
//            int right = i + 1;
//            int left = i - 1;
//            // odd len
//            while (left >= 0 && right < s.length()){
//                if (s.charAt(left) == s.charAt(right)){
//                    if (right - left + 1 > max_len){
//                        ans = s.substring(left, right+1);
//                        max_len = right - left + 1;
//                    }
//                    left--;
//                    right++;
//                } else {
//                    break;
//                }
//            }
//            // even len
//            int even_r = i_cpy+1;
//            while (even_r < s.length()){
//                if (s.charAt(even_r) == s.charAt(i)){
//                    if (even_r - i + 1 > max_len){
//                        max_len++;
//                        ans = s.substring(i, even_r + 1);
//                        even_r++;
//                    }
//                    even_r++;
//                } else {
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
}
