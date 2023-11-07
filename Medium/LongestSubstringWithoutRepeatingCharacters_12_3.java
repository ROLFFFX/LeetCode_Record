package Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters_12_3 {
    public static void main(String[] args) {
        String test = " ";
        System.out.println(lengthOfLongestSubstring(test));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (longest_none_repeating_substring_at_index(s, i) > max_length){
                max_length = longest_none_repeating_substring_at_index(s, i);
            }
        }
        return max_length;
    }

    public static int longest_none_repeating_substring_at_index(String s, int s_i) {
        ArrayList char_arr = new ArrayList();
        for (int i = s_i; i < s.length(); i++) {
            if (!char_arr.contains(s.charAt(i))) {
                char_arr.add(s.charAt(i));
            } else {
                return char_arr.size();
            }
        }
        return char_arr.size();
    }
}

//    public int lengthOfLongestSubstring(String s) {
//        boolean flag = true;
//        ArrayList char_arr = new ArrayList();
//        int max_length = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (!char_arr.contains(s.charAt(i))){
//                char_arr.add(s.charAt(i));
//            } else {
//                flag = false;
//                if (char_arr.size()>max_length){
//                    max_length = char_arr.size();
//                }
//                char_arr = new ArrayList<>();
//                char_arr.add(s.charAt(i));
//            }
//            if (i == s.length()-1 && char_arr.size() > max_length){
//                max_length = char_arr.size();
//            }
//        }
//        if (flag){return s.length();}
//        return max_length;
//    }

//    public static int lengthOfLongestSubstring(String s){
//        return 1; //dummy
//    }

