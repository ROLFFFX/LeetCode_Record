package Medium;

public class Sum_of_Absolute_Differences_in_a_Sorted_Array {
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
