package Easy;

import java.util.HashSet;
import java.util.Set;

public class Check_if_All_the_Integers_in_a_Range_Are_Covered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> all = new HashSet<>();
        for(int[] range : ranges) {
            for(int i = range[0]; i <= range[1]; i++) {
                all.add(i);
            }
        }
        for(int i = left; i <= right; i++) {
            if(!all.contains(i)) return false;
        }
        return true;
    }
}
