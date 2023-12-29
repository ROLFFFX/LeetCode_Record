package Easy;

import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {
        Valid_Anagram solution = new Valid_Anagram();
        System.out.println(solution.isAnagram("aba", "aab"));

    }

    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        // loop through s
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int a : alphabet){
            if (a != 0){
                return false;
            }
        }
        return true;
    }

//    public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> s_map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) + 1);
//        }
//
//        HashMap<Character, Integer> t_map = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i), 0) + 1);
//        }
//
//        return s_map.equals(t_map);
//    }
}
