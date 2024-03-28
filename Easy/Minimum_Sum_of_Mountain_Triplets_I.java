package Easy;

public class Minimum_Sum_of_Mountain_Triplets_I {
    public int minimumSum(int[] nums) {
        int sum = 150;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (nums[i] < nums[j] && nums[k] < nums[j]){
                        sum = Math.min(nums[i] + nums[j] + nums[k], sum);
                    }
                }
            }
        }
        return sum == 150 ? -1 : sum;
    }
}
