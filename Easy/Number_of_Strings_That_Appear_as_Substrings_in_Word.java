package Easy;

public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for (String s : patterns){
            if (word.indexOf(s)!=-1) c++;
        }
        return c;
    }
}
