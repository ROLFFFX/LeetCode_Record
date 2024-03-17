package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection_of_Three_Sorted_Arrays {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for (int n : arr1) set1.add(n);
        for (int n : arr2) set2.add(n);
        List<Integer> ans = new ArrayList();
        for (int n : arr3){
            if (set1.contains(n) && set2.contains(n)){
                ans.add(n);
            }
        }
        return ans;
    }
}
