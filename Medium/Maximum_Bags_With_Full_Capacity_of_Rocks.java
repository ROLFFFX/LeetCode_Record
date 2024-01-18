package Medium;

import java.util.Arrays;

public class Maximum_Bags_With_Full_Capacity_of_Rocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[rocks.length];
        for (int i = 0; i < rocks.length; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int full = 0;
        for (int i = 0; i < diff.length; i++){
            if (diff[i] == 0) {
                full++;
                continue;
            }
            if (additionalRocks == 0) break;
            if (diff[i] <= additionalRocks){
                full++;
                additionalRocks -= diff[i];
            } else {
                additionalRocks = 0;
                break;
            }
        }
        return full;
    }
}
