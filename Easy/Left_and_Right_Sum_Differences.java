package Easy;

public class Left_and_Right_Sum_Differences {
    public int[] leftRightDifference_optimized(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) right+=nums[i];
        for (int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(left - right);
            left += nums[i];
            right -= nums[Math.min(i + 1, nums.length - 1)];
        }
        return ans;
    }
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int left = fl(nums, i);
            int right = fr(nums, i);
            ans[i] = Math.abs(left - right);
        }
        return ans;
    }
    public int fl(int[] nums, int i){
        int sum = 0;
        for (; i >= 0; --i){
            sum += nums[i];
        }
        return sum;
    }
    public int fr(int[] nums, int i){
        int sum = 0;
        for (; i < nums.length; ++i){
            sum += nums[i];
        }
        return sum;
    }
}
