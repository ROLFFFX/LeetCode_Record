package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInsertPosition_13_35 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){return i;}
        }
        return nums.length;   //dummy
    }
}
