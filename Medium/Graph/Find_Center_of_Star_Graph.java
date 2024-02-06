package Medium.Graph;

import java.util.HashMap;
import java.util.Map;

public class Find_Center_of_Star_Graph {
    public int findCenter_optimized(int[][] edges) {
        if (edges[0][1] == edges[1][1]) return edges[0][1];
        if (edges[0][0] == edges[1][0]) return edges[0][0];
        if (edges[0][1] == edges[1][0]) return edges[0][1];
        if (edges[0][0] == edges[1][1]) return edges[0][0];
        return -1;
    }
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < edges.length; i++){
            for (int j = 0; j < edges[0].length; j++){
                map.put(edges[i][j], map.getOrDefault(edges[i][j], 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == edges.length){
                return entry.getKey();
            }
        }
        return -1;
    }
}
