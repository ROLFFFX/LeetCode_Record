package Medium;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Number_of_Special_Characters_II {
    public static void main(String[] args) {
        int ans = numberOfSpecialChars("aaAbcBC");
        System.out.println(ans);
    }
        public static int numberOfSpecialChars(String word) {
            boolean[] lo = new boolean[26], up = new boolean[26];
            int res = 0;
            for (char ch : word.toCharArray())
                if (Character.isLowerCase(ch))
                    lo[ch - 'a'] = !up[ch - 'a'];
                else
                    up[ch - 'A'] = true;
            for (int i = 0; i < 26; ++i)
                res += lo[i] && up[i] ? 1 : 0;
            return res;
        }

}
