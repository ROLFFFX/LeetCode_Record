package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Find_the_Maximum_Number_of_Elements_in_Subset {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int max = 0;
        for (int key : keys){
            if (key == 1) continue;
            int temp = key;
            int count = 1;
            while (map.containsKey(temp * temp)){
                if (map.get(temp) >= 2){
                    count += 2;
                    // check overflow
                    long next = temp * temp;
                    if (next > Integer.MAX_VALUE || next < 0) {
                        break;
                    } else {
                        temp = (int) next;
                    }
                } else {
                    break;
                }
            }
            max = Math.max(count, max);
        }

        if (map.containsKey(1)){
            int count = map.get(1);
            if (count % 2 == 0) {
                count--;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
