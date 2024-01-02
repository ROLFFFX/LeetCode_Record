package Medium;

import java.util.ArrayList;
import java.util.List;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {
    public List<List<Integer>> findMatrix(int[] A) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = A.length, count[] = new int[n + 1];
        for (int a : A) {
            if (res.size() < ++count[a])
                res.add(new ArrayList<>());
            res.get(count[a] - 1).add(a);
        }
        return res;
    }
}
