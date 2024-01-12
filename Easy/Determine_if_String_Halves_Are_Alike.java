package Easy;

public class Determine_if_String_Halves_Are_Alike {
    public boolean halvesAreAlike(String s) {
        return numOfVowel(s.substring(0, s.length()/2)) == numOfVowel(s.substring(s.length()/2, s.length()));
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u' || c == 'A' || c =='E' || c == 'I' || c == 'O' || c =='U';
    }

    public int numOfVowel(String s){
        int count = 0;
        for (char c : s.toCharArray()){
            if (isVowel(c)) count++;
        }
        return count;
    }
}
