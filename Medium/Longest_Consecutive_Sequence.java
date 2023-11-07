package Medium;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2};
        int ans1 = longestConsecutive(nums1);   //4
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int ans2 = longestConsecutive(nums2);
        System.out.println();

    }
    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0){ return 0; }
        if (len == 1){ return 1; }
        Arrays.sort(nums);
        // traverse arr, see max consecutive at current digit, update max accordingly
        int ret_max = 1;
        for (int i = 0; i < len; i++){
            int max = 1;
            for (int j = i + 1; j < len; j++) {
                if (nums[i]+1 == nums[j]){
                    max++;
                    i++;
                } else if (nums[i] == nums[j]){
                    i++;
                    continue;
                } else {
                    break;
                }
            }
            if (max>ret_max){
                ret_max = max;
            }
        }
        return ret_max; //dummy
    }
}
