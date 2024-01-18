package Easy;

import java.util.HashMap;

public class Rearrange_Characters_to_Make_Target_String {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;
        for (char c : target.toCharArray()) {
            if (!map.containsKey(c)) return 0;
            ans = Math.min(ans, map.get(c) / countOccurrences(target, c));
        }
        return ans;
    }

    private int countOccurrences(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
