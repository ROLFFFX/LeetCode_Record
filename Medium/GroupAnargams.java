package Medium;

import java.sql.Array;
import java.util.*;

public class GroupAnargams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] char_arr = s.toCharArray();
            Arrays.sort(char_arr);
            if (!map.containsKey(String.valueOf(char_arr))){
                map.put(String.valueOf(char_arr), new ArrayList<>());
            }
            map.get(String.valueOf(char_arr)).add(s);
        }
        return new ArrayList<>(map.values());
    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//        if (strs == null || strs.length == 0) return new ArrayList<>();
//        Map<String, List<String>> map = new HashMap<>();
//        for (String s : strs) {
//            char[] ca = s.toCharArray();
//            Arrays.sort(ca);
//            String keyStr = String.valueOf(ca);
//            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
//            map.get(keyStr).add(s);
//        }
//        return new ArrayList<>(map.values());
//    }
}
