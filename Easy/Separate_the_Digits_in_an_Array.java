package Easy;

import java.util.Arrays;

public class Separate_the_Digits_in_an_Array {
    public static void main(String[] args) {
        Separate_the_Digits_in_an_Array solution =
                new Separate_the_Digits_in_an_Array();
        System.out.println(solution);
    }
    public static  int[] separateDigits(int[] nums) {
        String s = "";
        for (int num : nums) s += String.valueOf(num);
        int[] ans = new int[s.length()];
        int i = 0;
        for (char c : s.toCharArray()){
            ans[i] = c;
        }
        return ans;
    }
}
