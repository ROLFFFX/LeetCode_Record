package Medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
        for (int i : nums) heap.offer(i);
        for (int i = 1; i < k; i++){
            heap.poll();
        }
        return heap.poll();
    }
}
