package Easy;

public class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        // first window
        double sum = 0;
        for (int i = 0; i < k; i++){
            sum+=nums[i];
        }
        double max = sum;
        for (int i = 1; i <= nums.length - k; i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}
