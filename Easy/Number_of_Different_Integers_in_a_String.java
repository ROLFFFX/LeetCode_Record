package Easy;

import java.util.HashSet;

public class Number_of_Different_Integers_in_a_String {
    public int numDifferentIntegers(String word) {
        String[] words = word.split("[a-z]");
        HashSet<String> set = new HashSet();
        for (String s : words){
            if (s == "") continue;
            set.add(s.replaceFirst("^0+(?!$)", ""));
        }
        return set.size();
    }
}
