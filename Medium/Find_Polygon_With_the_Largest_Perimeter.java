package Medium;

import java.util.Arrays;

public class Find_Polygon_With_the_Largest_Perimeter {
    public long largestPerimeter(int[] A) {
        Arrays.sort(A);
        long res = -1, cur = 0;
        for (int i = 0; i < A.length; ++i)
            if ((cur += A[i]) > A[i] * 2)
                res = cur;
        return res;
    }
}
