package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts {
    public int minimumOperations_optimized(int[] nums) {
        HashSet<Integer> num = new HashSet();
        for (int n : nums) num.add(n);
        if (num.contains(0)) return num.size() - 1;
        return num.size();
    }
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
