package Easy;

public class First_Letter_to_Appear_Twice {
    public char repeatedCharacter(String s) {
        int[] bucket = new int[26];
        for (char c : s.toCharArray()){
            if (bucket[c - 'a']++ == 1){
                return c;
            }
        }
        return 'a';
    }
}
