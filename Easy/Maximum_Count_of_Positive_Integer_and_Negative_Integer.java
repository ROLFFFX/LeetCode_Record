package Easy;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public int maximumCount(int[] nums) {
        int p = 0;
        int n = 0;
        for (int num : nums){
            if (num < 0) n++;
            if (num > 0) p++;
        }
        return Math.max(p, n);
    }
}
