package Easy;

import java.util.Arrays;

public class Separate_the_Digits_in_an_Array {
    static int[] test = {1,2,3,4};
    public static void main(String[] args) {
        int[] ans = separateDigits(test);
        System.out.println(ans);
    }
    public static int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) sb.append(num);
        String s = sb.toString();
        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i) - '0';
        }
        return ans;
    }
}
