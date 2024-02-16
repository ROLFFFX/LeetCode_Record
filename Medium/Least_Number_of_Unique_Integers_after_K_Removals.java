package Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Least_Number_of_Unique_Integers_after_K_Removals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue(map.values());
        while (k > 0){
            k -= pq.poll();
        }
        return k < 0 ? pq.size() + 1 : pq.size();

    }
}
