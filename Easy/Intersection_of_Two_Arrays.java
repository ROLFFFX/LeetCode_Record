package Easy;

import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums1){
            set.add(num);
        }
        HashSet<Integer> set2 = new HashSet();
        for (int num : nums2){
            if (set.contains(num)){
                set2.add(num);
            }
        }
        int[] ans = new int[set2.size()];
        int i = 0;
        for (int num : set2){
            ans[i++] = num;
        }
        return ans;
    }
}
