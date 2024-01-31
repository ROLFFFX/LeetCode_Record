package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList(map.keySet());
        Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < map.get(c); i++) sb.append(c);
        }
        return sb.toString();

    }
}
