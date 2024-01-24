package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
    // optimized O(m + n)
    public int[] intersect_optimized(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList();
        for (int num : nums2){
            if (map.containsKey(num) && map.get(num) > 0){
                ans.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ret = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            ret[i] = ans.get(i);
        }
        return ret;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    nums2[j] = -1;
                    ans.add(nums1[i]);
                    break;
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
