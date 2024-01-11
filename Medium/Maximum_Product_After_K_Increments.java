package Medium;

import java.util.PriorityQueue;

public class Maximum_Product_After_K_Increments {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int num : nums) heap.add(num);
        for (int i = 0; i < k; i++){
            int curr = heap.poll() + 1;
            heap.add(curr);
        }
        long ans = 1;
        int mod = 1000000007;
        while (!heap.isEmpty()){
            ans = (ans * heap.poll()) % mod;
        }
        return (int)ans;
    }
}
