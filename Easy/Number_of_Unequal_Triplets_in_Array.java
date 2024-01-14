package Easy;

public class Number_of_Unequal_Triplets_in_Array {
    public int unequalTriplets(int[] nums) {
        if (nums.length < 3) return 0;
        int c = 0;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
