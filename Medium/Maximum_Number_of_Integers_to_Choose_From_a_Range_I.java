package Medium;

import java.util.HashSet;

public class Maximum_Number_of_Integers_to_Choose_From_a_Range_I {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> ans = new HashSet();
        int sum = 0;
        for (int na : banned) set.add(na);
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) continue;
            if (sum + i > maxSum) {
                break;
            }
            sum += i;
            ans.add(i);
        }
        return ans.size();
    }
}
