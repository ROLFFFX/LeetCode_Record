package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // find common elements in two arrays, exclude them when generating ans
        HashSet<Integer> a = new HashSet();
        HashSet<Integer> b = new HashSet();
        for (int num:nums1){
            a.add(num);
        }
        for (int num:nums2){
            b.add(num);
        }
        List<Integer> one = new ArrayList();
        for (int num:a){
            if (!b.contains(num)){
                one.add(num);
            }
        }
        List<Integer> two = new ArrayList();
        for (int num:b){
            if (!a.contains(num)){
                two.add(num);
            }
        }
        List ans = new ArrayList();
        ans.add(one);
        ans.add(two);
        return ans;
    }
}
