package Easy;

public class Reverse_Prefix_Of_Word {
    public String reversePrefix(String word, char ch) {
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++){
            if (words[i] == ch){
                //reverse and return;
                int j = 0;
                while (j < i){
                    char temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                    i--;
                    j++;
                }
                break;
            }
        }
        String ans = new String(words);
        return ans;
    }
}
