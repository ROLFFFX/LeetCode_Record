package Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        // initialize map to store num:freq
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // initialize pq to sort and store keysets
        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        for (int key : map.keySet()){
            pq.add(key);
        }
        // generate ans
        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
