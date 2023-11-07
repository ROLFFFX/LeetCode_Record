package Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums1 = {1,0,3};  //2
        int[] nums2 = {0,1};;   //2
        int[] nums3 = {9,6,4,2,3,5,7,0,1};  //8
        int ans = missingNumber(nums3);
        System.out.println();
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        // correct sum:
        int cor_sum = (nums.length + 1 )* nums.length/2;
        return cor_sum-sum;
    }

    /** Not Optimal **/
//    public int missingNumber(int[] nums) {
//        HashSet<Integer> new_set = new HashSet<>(nums.length);
//        for (int num : nums){
//            //cross compare
//            new_set.add(num);
//        }
//        for (int i = 0; i <= nums.length; i++){
//            if (!new_set.contains(i)){
//                return i;
//            }
//        }
//        return -1;
//    }
}
