package Easy;

import java.util.HashSet;

public class Find_the_Distinct_Difference_Array {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            HashSet<Integer> set = new HashSet();
            HashSet<Integer> set2 = new HashSet();
            for (int k = 0; k <= i; k++){
                set2.add(nums[k]);
            }
            for (int j = i + 1; j < nums.length; j++){
                set.add(nums[j]);
            }
            ans[i] = set2.size() - set.size();
        }
        return ans;
    }
}
