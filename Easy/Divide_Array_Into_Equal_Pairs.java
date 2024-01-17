package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Divide_Array_Into_Equal_Pairs {
    public boolean divideArray_optimized(int[] nums) {
        int[] bucket = new int[501];
        Arrays.fill(bucket, 0);
        for (int num : nums){
            bucket[num]++;
        }
        for (int num : bucket){
            if (num % 2 != 0) return false;
        }
        return true;
    }
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int value : map.values()){
            if (value % 2 != 0) return false;
        }
        return true;
    }
}
