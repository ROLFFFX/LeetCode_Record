package Medium;

public class Longest_Binary_Subsequence_Less_Than_or_Equal_to_K {
    public int longestSubsequence(String s, int k) {
        // traverse from back
        String ans = "";
        int sum = 0;
        int i = s.length() - 1;
        for (; i >= 0; i--){
            ans = s.charAt(i) + ans;
            if (s.charAt(i) == '1'){
                sum += Math.pow(2, s.length() - i - 1);
            }
            if (sum > k) {
                ans = ans.substring(1, ans.length());
                break;
            }
        }
        for (; i>= 0; i--){
            if (s.charAt(i) == '0') ans+='0';
        }
        return ans.length();
    }
}
