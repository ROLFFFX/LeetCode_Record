package Easy;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        Set_Mismatch solution = new Set_Mismatch();
        int [] ans = solution.findErrorNums(new int[]{1,1});
        System.out.println();
    }
    public int[] findErrorNums(int[] nums) {
        // cycle sort.
        int[] bucket = new int[nums.length];
        Arrays.fill(bucket, 1);
        for (int num : nums){
            bucket[num - 1]--;
        }
        int[] ans = new int[2];
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == -1) ans[0] = i + 1;
            if (bucket[i] == 1) ans[1] = i + 1;
        }
        return ans;
    }
}
