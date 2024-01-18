package Medium;

public class Sum_of_Even_Numbers_After_Queries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            // for n queries
            nums[queries[i][1]] += queries[i][0];
            int even = 0;
            for (int num : nums){
                if (num % 2 == 0) even += num;
            }
            ans[i] = even;
        }
        return ans;
    }
}
