package Easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class Minimum_Amount_of_Time_to_Fill_Cups {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        for (int i : amount){
            if (i != 0) q.offer(i);
        }
        int count = 0;
        while (q.size() > 1){
            count++;
            int max1 = q.poll() - 1;
            int max2 = q.poll() - 1;

            if (max1 > 0) q.offer(max1);
            if (max2 > 0) q.offer(max2);
        }
        if (!q.isEmpty()) count += q.poll();
        return count;
    }
}
