package Medium;

import java.util.HashMap;

public class Longest_Substring_with_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap();
        char[] arr = s.toCharArray();
        while (j < arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if (map.size() > 2) {
                while (map.size() > 2) {
                    map.put(arr[i], map.get(arr[i]) - 1);
                    if (map.get(arr[i]) == 0) {
                        map.remove(arr[i]);
                    }
                    i++;
                }
            }
            max = Math.max(j - i, max);
            j++;
        }
        return max + 1;
    }
}
