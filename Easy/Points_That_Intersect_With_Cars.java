package Easy;

import java.util.HashSet;
import java.util.List;

public class Points_That_Intersect_With_Cars {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set = new HashSet();
        for (List<Integer> entry : nums){
            for (int i = entry.get(0); i <= entry.get(1); i++){
                set.add(i);
            }
        }
        return set.size();
    }
}
