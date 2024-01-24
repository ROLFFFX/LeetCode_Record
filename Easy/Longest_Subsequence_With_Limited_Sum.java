package Easy;

import java.util.Arrays;

public class Longest_Subsequence_With_Limited_Sum {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++){
            int sum = 0;
            int j = 0;
            while (j < nums.length){
                sum += nums[j++];
                if (sum > queries[i]) {
                    j--;
                    break;
                }
            }
            ans[i] = j;
        }
        return ans;
    }
}
