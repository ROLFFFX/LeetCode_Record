package Medium;

import java.util.HashSet;

public class Find_the_Prefix_Common_Array_of_Two_Arrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int prefix = 0;
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
            set2.add(B[i]);
            if (set2.contains(A[i])) prefix++;
            if (set1.contains(B[i])) prefix++;
            if (A[i] == B[i]) prefix--;
            ans[i] = prefix;
        }
        return ans;
    }
}
