package Medium;

public class K_Radius_Subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        // If the window size (2k + 1) is larger than the array, return ans filled with -1
        if (2 * k + 1 > n) {
            return ans;
        }

        // Using long for sum to prevent integer overflow
        long sum = 0;
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }

        ans[k] = (int) (sum / (2 * k + 1));

        // Calculating averages for the rest of the windows
        for (int i = k + 1; i <= n - k - 1; i++) {
            sum -= nums[i - k - 1];
            sum += nums[i + k];
            ans[i] = (int) (sum / (2 * k + 1));
        }

        return ans;
    }
}
