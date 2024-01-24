package Easy;

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++){
            curr += nums[i];
            nums[i] = curr;
        }
        return nums;
    }
}
