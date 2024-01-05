package Easy;

import java.util.HashSet;

public class Minimize_String_Length {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet();
        for (char c:s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}
