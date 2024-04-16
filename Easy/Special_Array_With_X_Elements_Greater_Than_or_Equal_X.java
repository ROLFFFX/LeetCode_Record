package Easy;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public int specialArray(int[] nums) {
        for (int cand = 1; cand <= nums.length; cand++) {
            int c = 0;
            for (int num : nums) {
                if (num >= cand) c++;
            }
            System.out.println(cand);
            if (c == cand) return cand;
        }
        return -1;
    }
}
