package Easy;

import java.util.Arrays;

public class Maximum_Sum_With_Exactly_K_Elements_ {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        return (2 * max + k) * (k + 1) / 2 - max - k;
    }
}
