package Medium;

import java.util.*;

public class Find_Players_With_Zero_or_One_Losses {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zero = new ArrayList();
        HashSet<Integer> zeroes = new HashSet();
        List<Integer> one = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();  // player, losses
        for (int[] match : matches){
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
            zeroes.add(match[0]);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) zero.add(entry.getKey());
            zeroes.remove(entry.getKey());
        }
        for (int player : zeroes) one.add(player);
        Collections.sort(zero);
        Collections.sort(one);
        List<List<Integer>> ans = new ArrayList();
        ans.add(one);
        ans.add(zero);
        return ans;
    }
}
