package Easy;

public class Merge_String_Alternatively {
    public String mergeAlternately_2(String word1, String word2) {
        String merged = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()){
            if (i < word1.length()){
                merged+=word1.charAt(i);
            }
            if (j < word2.length()){
                merged+=word2.charAt(j);
            }
            i++;
            j++;
        }
        return merged;
    }
    public String mergeAlternately(String word1, String word2) {
        int index = Math.min(word1.length(), word2.length());
        String merged = "";
        for (int i = 0; i < index; i++){
            merged += word1.charAt(i);
            merged += word2.charAt(i);
        }
        merged += leftover(word1, word2, index);
        return merged;
    }
    public String leftover(String word1, String word2, int index){
        if (word1.length() >= word2.length()){
            return word1.substring(index, word1.length());
        } else {
            return word2.substring(index, word2.length());
        }
    }
}
