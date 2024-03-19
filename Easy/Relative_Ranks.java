package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks {
    public String[] findRelativeRanks(int[] score) {
        Integer[] cpy = new Integer[score.length];
        for (int i = 0; i < score.length; i++) cpy[i] = score[i];
        Arrays.sort(cpy, (a, b) -> b - a);
        HashMap<Integer, String> map = new HashMap();
        for (int i = 0; i < cpy.length; i++){
            map.put(cpy[i], String.valueOf(i + 1));
        }
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++){
            ans[i] = map.get(score[i]);
            if (ans[i].equals("1")) ans[i] = "Gold Medal";
            if (ans[i].equals("2")) ans[i] = "Silver Medal";
            if (ans[i].equals("3")) ans[i] = "Bronze Medal";
        }
        return ans;
    }
}
