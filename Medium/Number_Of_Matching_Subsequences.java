package Medium;

import java.util.HashMap;

public class Number_Of_Matching_Subsequences {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        int ans = numMatchingSubseq(s, words);
        System.out.println(ans);
    }

    public static int numMatchingSubseq(String s, String[] words) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String str : words){
                map.put(str, map.getOrDefault(str, 0)+1);
            }

            int ans = 0;
            char[] ch = s.toCharArray();
            for (String str : map.keySet()){
                char temp[] = str.toCharArray();
                int i = 0;
                int j = 0;

                while (i < ch.length && j < temp.length){
                    if (ch[i] == temp[j]){
                        i++;
                        j++;
                    } else {
                        i++;
                    }
                }if(j==temp.length){
                    ans+=map.get(str);
                }
            }
            return ans;
        }
    }

//    public static int numMatchingSubseq(String s, String[] words) {
//        int count = 0;
//        for (int i = 0; i < words.length; i++) {
//            String curr_word = words[i];
//            //check if curr word is a subsequence
//            if (isSubsequence(s, curr_word)){
//                count++;
//            }
//        }
//        return count;   //dummy
//    }

//    public static boolean isSubsequence(String s, String curr_word){
//        //traverse current word
//        int count = 0;
//        for (int i = 0; i < curr_word.length(); i++) {
//            char curr_digit = curr_word.charAt(i);
//            //traverse string
//            for (int j = count; j < s.length(); j++) {
//                if (s.charAt(j) == curr_digit){
//                    count++;
//                    break;
//                }
//            }
//        }
//        if (count == curr_word.length()){return true;}
//        return false;    //dummy
//    }

