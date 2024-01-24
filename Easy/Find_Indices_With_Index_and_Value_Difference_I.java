package Easy;

public class Find_Indices_With_Index_and_Value_Difference_I {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length - indexDifference; i++){
            int j = i + indexDifference;
            while (j < nums.length){
                if (Math.abs(nums[j] - nums[i]) >= valueDifference){
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return new int[]{-1,-1};
    }
}
