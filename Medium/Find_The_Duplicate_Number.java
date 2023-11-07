package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Find_The_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int ans = findDuplicate(nums2);
        System.out.println();


    }

    /** 50% **/
    public static int findDuplicate(int[] nums) {   //Cycle Sort
        //traverse array and place the correct item
        int ptr = 0;    //ptr for traverse arr
        while (ptr < nums.length){
            //correct item at nums[ptr] should be ptr + 1
            if (nums[ptr] != ptr + 1){
                //if current digit is at wrong place, but correct place is already occupied with current item
                if (nums[nums[ptr] - 1] == nums[ptr]){
                    return nums[ptr];
                }
                //place temp at correct digit
                int temp = nums[ptr];
                nums[ptr] = nums[temp - 1];
                nums[temp - 1] = temp;
                continue;
            }
            ptr++;
        }
        return nums[nums.length - 1];
    }
    /** First Attempt **/
//    public static int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i+1]){
//            return nums[i];
//            }
//        }
//        return -1;
//    }
}
