package Medium;

import java.util.Arrays;

public class Three_Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int curr_t = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - curr_t)){
                    curr_t = sum;
                }
                if (sum > target) k--;
                else j++;

            }
        }
        return curr_t;
    }
}
