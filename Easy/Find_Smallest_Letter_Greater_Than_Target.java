package Easy;

import java.util.Arrays;

public class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for (char c : letters){
            if (c > target) return c;
        }
        return letters[0];
    }
}
