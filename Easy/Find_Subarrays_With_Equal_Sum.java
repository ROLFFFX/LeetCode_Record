package Easy;

import java.util.HashSet;

public class Find_Subarrays_With_Equal_Sum {
    public boolean findSubarrays(int[] nums) {
        if (nums.length <= 2) return false;
        // sliding window
        HashSet<Integer> visited = new HashSet();
        int sum = nums[0] + nums[1];
        visited.add(sum);
        for (int i = 2; i < nums.length; i++){
            sum = sum - nums[i - 2] + nums[i];
            if (visited.contains(sum)) return true;
            visited.add(sum);
        }
        return false;
    }
}
