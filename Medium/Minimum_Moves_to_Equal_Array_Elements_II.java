package Medium;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = 0;
        if (nums.length % 2 == 0){
            median = (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            median = nums[nums.length / 2];
        }
        int sum = 0;
        for (int num : nums){
            sum += Math.abs(num - median);
        }
        return sum;
    }
}
