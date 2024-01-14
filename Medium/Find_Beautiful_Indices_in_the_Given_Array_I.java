package Medium;

import java.util.ArrayList;
import java.util.List;

public class Find_Beautiful_Indices_in_the_Given_Array_I {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aIndices = findIndices(s, a);
        List<Integer> bIndices = findIndices(s, b);
        List<Integer> beautifulIndices = new ArrayList<>();
        for (int i : aIndices) {
            for (int j : bIndices) {
                if (Math.abs(j - i) <= k) {
                    beautifulIndices.add(i);
                    break;
                }
            }
        }
        return beautifulIndices;
    }

    private List<Integer> findIndices(String s, String sub) {
        List<Integer> indices = new ArrayList<>();
        int length = sub.length();
        for (int i = 0; i <= s.length() - length; i++) {
            if (s.substring(i, i + length).equals(sub)) {
                indices.add(i);
            }
        }
        return indices;
    }
}
