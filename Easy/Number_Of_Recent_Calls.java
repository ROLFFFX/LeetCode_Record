package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Number_Of_Recent_Calls {
    Queue<Integer> queue;
    public void RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
