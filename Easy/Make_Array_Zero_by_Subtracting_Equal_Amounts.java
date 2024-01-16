package Easy;

import java.util.Arrays;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int curr = nums[i];
                for (int j = i; j < nums.length; j++){
                    nums[j] -= curr;
                }
                c++;
            }
        }
        return c;
    }
}
