package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // given two arrays of number, how many items in s are greater than items in g?
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        HashSet<Integer> visited_index = new HashSet();
        for (int c : s){
            for (int i = g.length - 1; i >= 0; i--){
                if (c >= g[i]){
                    if (visited_index.add(i)){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
