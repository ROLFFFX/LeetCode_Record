package Medium;

public class Sum_of_Absolute_Differences_in_a_Sorted_Array {
    public int[] getSumAbsoluteDifferences_optimized(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++){
            right += nums[i];
        }
        int[] ans = new int[nums.length];
        ans[0] = right - (nums.length - 1) * nums[0];
        for (int i = 1; i < nums.length; i++){
            left += nums[i - 1];
            right -= nums[i];
            ans[i] = (i * nums[i] - left) + (right - (nums.length - i - 1) * nums[i]);
        }
        return ans;
    }
    // tle
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int left = i - 1;
            int right = i + 1;
            int left_sum = 0;
            int right_sum = 0;
            while (left >= 0){
                left_sum +=  nums[i] - nums[left];
                left--;
            }
            while (right < nums.length){
                right_sum += nums[right] - nums[i];
                right++;
            }
            ans[i] = left_sum + right_sum;
        }
        return ans;
    }
}
