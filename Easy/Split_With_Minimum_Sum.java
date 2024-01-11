package Easy;

import java.util.Arrays;

public class Split_With_Minimum_Sum {
    public int splitNum(int num) {
        // find two smallest numbers, concatenate numbers behind smaller
        char[] number = String.valueOf(num).toCharArray();
        String nums1 = "";
        String nums2 = "";
        Arrays.sort(number);
        for (int i = 0; i < number.length; i+=2){
            nums1 += number[i];
        }
        for (int i = 1; i < number.length; i+=2){
            nums2 += number[i];
        }

        return Integer.valueOf(nums1) + Integer.valueOf(nums2);
    }
}
