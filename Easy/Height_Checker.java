package Easy;

import java.util.Arrays;

public class Height_Checker {
    public int heightChecker(int[] heights) {
        int[] cpy = new int[heights.length];
        for (int i = 0; i < heights.length; i++) cpy[i] = heights[i];
        int c = 0;
        Arrays.sort(cpy);
        for (int i = 0; i < heights.length; i++) {
            if (cpy[i] != heights[i]) c++;
        }
        return c;
    }
}
