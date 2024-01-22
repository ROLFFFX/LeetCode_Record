package Easy;

import java.util.HashSet;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public int findMaxK(int[] nums) {
        int ans = -1;
        HashSet<Integer> set = new HashSet();
        for (int num : nums){
            if (num < 0){
                set.add(num);
            }
        }
        for (int num : nums){
            if (num > 0 && set.contains(-num)){
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}
