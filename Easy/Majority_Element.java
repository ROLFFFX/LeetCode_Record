package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    //Moore Voting Algorithm beats 100%
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            if (num == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    /** That Passed but it's cheating **/
//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//    }
}
