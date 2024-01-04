package Medium;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int t : mp.values()) {
            if (t == 1)
                return -1;
            count += t / 3;
            if (t % 3 != 0)
                count++;
        }
        return count;
    }
}
