package Hard;

import java.util.HashMap;
import java.util.Map;

public class Arithmetic_Slices_II_Subsequences {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        Map<Long, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; ++i) {
            dp[i] = new HashMap<>();

            for (int j = 0; j < i; ++j) {
                long diff = (long) nums[i] - nums[j];
                int sequencesEndingAtJ = dp[j].getOrDefault(diff, 0);
                int sequencesEndingAtI = dp[i].getOrDefault(diff, 0);

                // Add the number of valid sequences ending at j to the count
                count += sequencesEndingAtJ;

                // Update the number of sequences ending at i with the current difference
                dp[i].put(diff, sequencesEndingAtI + sequencesEndingAtJ + 1);
            }
        }

        return count;
    }
}
