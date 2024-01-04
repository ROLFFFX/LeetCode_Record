package Medium;

import java.util.Arrays;

public class Determine_If_Two_Strings_Are_Close {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int[] bucket1 = new int[26];
        int[] bucket2 = new int[26];
        for (int i = 0; i < word1.length(); i++){
            bucket1[word1.charAt(i) - 'a']++;
            bucket2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < bucket1.length; i++){
            if ((bucket1[i] == 0 && bucket2[i] != 0) ||
                    bucket2[i] == 0 && bucket1[i] != 0){
                return false;
            }
        }
        
        Arrays.sort(bucket1);
        Arrays.sort(bucket2);
        for (int i = 0; i < bucket1.length; i++){
            if (bucket1[i] != bucket2[i]){
                return false;
            }
        }
        return true;
    }
}
