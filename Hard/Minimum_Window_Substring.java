package Hard;

import java.util.HashMap;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
//        Given two strings s and t of lengths m and n respectively, return the minimum
//        window substring of s such that every character in t (including duplicates) is
//        included in the window. If there is no such substring, return the empty string "".
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = minWindow(s, t);
        System.out.println(ans);

    }

    public static String minWindow(String s, String t) {
        //store t in hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        // K is char, V is number of it occured
        for (int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        // now map contains all char from t
        int j = 0;
        int i = 0;
        // two pointers to expand map
        int count = map.size();
        int ans = Integer.MAX_VALUE;
        int start = 0;
        while (j < s.length()){
            // decrement value if char exists in t
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
            if (map.get(s.charAt(j)) == 0) {    // if map value becomes 0, decrement count
                count--;
            }
            // if count becomes 0, meaning all keys from map are found in map
            if (count == 0) {
                // see if can shrink ans
                while (count == 0) {
                    if (ans > j - i + 1) {
                        ans = j - i + 1;
                        start = i;
                    }
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                    if (map.get(s.charAt(i)) > 0)
                        count++;

                    i++;
                }
            }
            j++;
        }
        if (ans != Integer.MAX_VALUE)
            return s.substring(start, start + ans);
        else
            return "";
    }
}
