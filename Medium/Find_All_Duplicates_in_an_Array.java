package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<Integer>();
        ans = findDuplicates(nums);
        System.out.println();
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0){
                ans.add(index + 1);
            } else {
                nums[index] *= -1;
            }
        }
        return ans;
    }

//    public static List<Integer> findDuplicates(int[] nums) {
//        final List<Integer> result = new ArrayList<>();
//
//        int sum = 0;
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max){max = nums[i];}
//            sum+= nums[i];
//        }
//        int correct_sum = (1+max)*nums.length/2;
//        int correct_length = max;
//        int surplus = sum - correct_sum;
//        int surplus_len = nums.length - correct_length;
//
//        return result;
//    }


    /** First Attempt beats 30%**/
    //Given an integer array nums of length n where all the integers of nums are in the range [1, n]
    // and each integer appears once or twice, return an array of all the integers that appears twice.
//    public static List<Integer> findDuplicates(int[] nums) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int len = nums.length;
//        if (len <= 1){return ans;}
//        //
//        Arrays.sort(nums);
//        for (int i = 1;i < len; i++) {
//            if (nums[i] == nums[i-1]){
//                ans.add(nums[i]);
//            }
//        }
//        return ans;
//    }
}
