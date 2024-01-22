package Easy;

public class Number_of_Arithmetic_Triplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                if (nums[j] - nums[i] == diff){
                    for (int k = j + 1; k < nums.length; k++){
                        if (nums[j] + diff == nums[k]){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
