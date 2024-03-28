package Medium;

import java.util.HashMap;

public class Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap(); // num, freq
        int left = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if (map.get(nums[right]) > k){
                while (left < right && map.get(nums[right]) > k){
                    map.put(nums[left], map.get(nums[left]) - 1);
                    left++;
                }
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
