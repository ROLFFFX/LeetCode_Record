package Easy;

import java.util.LinkedHashMap;

public class Kth_Distinct_String_in_an_Array {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // char, freq
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String key : arr) {
            if (map.get(key) == 1) {
                count++;
                if (count == k) return key;
            }
        }
        return ""; // return empty string if kth distinct element doesn't exist
    }
}
