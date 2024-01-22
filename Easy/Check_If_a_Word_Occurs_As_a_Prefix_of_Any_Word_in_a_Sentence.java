package Easy;

public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int c = 1;
        for (String word : sentence.split(" ")){
            if (check(word.toCharArray(), searchWord.toCharArray())){
                return c;
            }
            c++;
        }
        return -1;
    }

    public boolean check(char[] target, char[] prefix){
        if (target.length < prefix.length) return false;
        for (int i = 0; i < prefix.length; i++){
            if (target[i] != prefix[i]) return false;
        }
        return true;
    }
}
