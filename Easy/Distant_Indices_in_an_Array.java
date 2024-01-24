package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Distant_Indices_in_an_Array {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == key){
                for (int j = i; j >= i - k && j >= 0; j--){
                    set.add(j);
                }
                for (int j = i; j <= i + k && j < nums.length; j++){
                    set.add(j);
                }
            }
        }
        List<Integer> arr = new ArrayList();
        for (int num : set){
            arr.add(num);
        }
        Collections.sort(arr);
        return arr;
    }
}
