package Medium;

import java.util.PriorityQueue;

public class Minimum_Cost_to_Connect_Sticks {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int i : sticks) heap.add(i);
        int cost = 0;
        while (heap.size() > 1){
            int first = heap.poll();
            int second = heap.poll();
            int newStick = first + second;
            heap.add(newStick);
            cost += newStick;
        }
        return cost;
    }
}
