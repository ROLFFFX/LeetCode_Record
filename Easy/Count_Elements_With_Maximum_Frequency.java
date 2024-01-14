package Easy;

import java.util.HashMap;

public class Count_Elements_With_Maximum_Frequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        int max = 0;
        for (int val : map.values()){
            if (val > max) max = val;
        }
        for (int val : map.values()){
            if (val == max) ans += val;
        }
        return ans;
    }
}
