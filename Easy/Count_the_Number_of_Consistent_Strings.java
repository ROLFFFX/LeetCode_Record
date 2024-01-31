package Easy;

import java.util.HashSet;

public class Count_the_Number_of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet();
        for (char c : allowed.toCharArray()) set.add(c);
        for (String word : words){
            for (char c : word.toCharArray()){
                if (!set.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}
