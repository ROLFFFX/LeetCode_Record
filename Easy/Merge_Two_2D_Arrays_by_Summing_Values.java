package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Merge_Two_2D_Arrays_by_Summing_Values {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap();  // id, sum
        for (int[] arr : nums1){
            map.put(arr[0], arr[1]);
        }
        for (int[] arr : nums2){
            if (map.containsKey(arr[0])){
                map.put(arr[0], map.get(arr[0])+ arr[1]);
            } else {
                map.put(arr[0], arr[1]);
            }
        }
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (int key : map.keySet()){
            ans[i++] = new int[]{key, map.get(key)};
        }
        Arrays.sort(ans, (a, b)->a[0]-b[0]);
        return ans;
    }
}
