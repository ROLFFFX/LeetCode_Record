package Medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Minimum_Number_of_Operations_to_Make_X_and_Y_Equal {
    public int minimumOperationsToMakeEqual(int x, int y) {
        // brute force use bfs?
        // at each step explore all possibilities until x equals to y
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(new int[]{x, 0});
        visited.add(x);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int operations = current[1];

            if (currentValue == y) {
                return operations;
            }

            if (currentValue % 11 == 0 && !visited.contains(currentValue / 11)) {
                queue.offer(new int[]{currentValue / 11, operations + 1});
                visited.add(currentValue / 11);
            }
            if (currentValue % 5 == 0 && !visited.contains(currentValue / 5)) {
                queue.offer(new int[]{currentValue / 5, operations + 1});
                visited.add(currentValue / 5);
            }
            if (!visited.contains(currentValue + 1)) {
                queue.offer(new int[]{currentValue + 1, operations + 1});
                visited.add(currentValue + 1);
            }
            if (!visited.contains(currentValue - 1)) {
                queue.offer(new int[]{currentValue - 1, operations + 1});
                visited.add(currentValue - 1);
            }
        }
        return -1;
    }
}
