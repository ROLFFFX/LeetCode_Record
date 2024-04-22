package Easy;

import java.util.*;

public class Find_if_Path_Exists_in_Graph {
    public boolean validPath_opt(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        HashSet<Integer> visited = new HashSet();
        Queue<Integer> q = new LinkedList();
        q.add(source);
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                int curr = q.poll();
                if (!visited.add(curr)) continue;
                for (int[] edge : edges) {
                    if (edge[0] == curr) {
                        if (edge[1] == destination) return true;
                        q.add(edge[1]);
                    }
                    if (edge[1] == curr) {
                        if (edge[0] == destination) return true;
                        q.add(edge[0]);
                    }

                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Set<Integer> visited = new HashSet<>();
        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (node == destination) {
            return true;
        }
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
