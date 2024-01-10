package Medium.Amount_of_Time_for_Binary_Tree_to_Be_Infected;

import java.util.*;

public class Amount_of_Time_for_Binary_Tree_to_Be_Infected {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        createGraph(root, graph);
        return maxDistance(graph, new HashSet<>(), start, 0, 0);
    }

    private void createGraph(TreeNode root, Map<Integer, List<Integer>> graph) {
        List<Integer> adjacent = graph.computeIfAbsent(root.val, parameter -> new ArrayList<>());

        if (root.left != null) {
            graph.computeIfAbsent(root.left.val, param -> new ArrayList<>()).add(root.val);
            adjacent.add(root.left.val);
            createGraph(root.left, graph);
        }
        if (root.right != null) {
            graph.computeIfAbsent(root.right.val, param -> new ArrayList<>()).add(root.val);
            adjacent.add(root.right.val);
            createGraph(root.right, graph);
        }
    }

    private int maxDistance(Map<Integer, List<Integer>> graph, Set<Integer> visited, int currentNode, int maxDistance, int currentDistance) {
        if (!visited.contains(currentNode)) {
            visited.add(currentNode);
            maxDistance = Math.max(maxDistance, currentDistance);

            for (int neighbour : graph.get(currentNode)) {
                maxDistance = Math.max(maxDistance(graph, visited, neighbour, maxDistance, currentDistance + 1), maxDistance);
            }
        }
        return maxDistance;
    }
}
