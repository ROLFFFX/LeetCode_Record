package Medium;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Consecutive_Cards_to_Pick_Up {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap();
        int min = 100001;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                min = Math.min(i - map.get(cards[i]) + 1, min);
            }
            map.put(cards[i], i);
        }
        return min == 100001 ? -1 : min;
    }
}
