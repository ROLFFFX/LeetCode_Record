package Medium;

import java.util.PriorityQueue;

public class Minimize_Length_of_Array_Using_Operations {
    public static void main(String[] args) {
        Minimize_Length_of_Array_Using_Operations solution = new Minimize_Length_of_Array_Using_Operations();
        System.out.println(solution.minimumArrayLength(new int[]{1,4,4,1}));
    }
    public int minimumArrayLength(int[] A) {
        int v = A[0], cnt = 0;
        for (int a: A)
            v = Math.min(v, a);
        for (int x : A)
            if (x % v > 0)
                return 1;
        for (int a : A)
            if (a == v)
                cnt++;
        return (cnt + 1) / 2;
    }
}
