package Easy;

import java.util.HashMap;

public class Repeated_Element_in_Size_2N_Array {
    public int repeatedNTimes_optimized(int[] nums) {
        int[] bucket = new int[10000];
        for (int num : nums){
            if (bucket[num]++ == 1) return num;
        }
        return -1;
    }
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;    // fidn the one with freq of n
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == n){
                return num;
            }
        }
        return -1;
    }
}
