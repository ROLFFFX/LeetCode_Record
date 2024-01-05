package Medium;

import java.util.HashMap;

public class Equal_Row_and_Column_Pairs {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> rowMap = new HashMap<>();
        HashMap<String, Integer> colMap = new HashMap<>();
        int row = grid.length;
        int col = row;

        // Encode rows
        for (int i = 0; i < row; i++){
            String currRow = "";
            String currCol = "";
            for (int j = 0; j < col; j++){
                currRow += grid[i][j] + "-";
                currCol += grid[j][i] + "-";
            }
            rowMap.put(currRow, rowMap.getOrDefault(currRow, 0) + 1);
            colMap.put(currCol, colMap.getOrDefault(currCol, 0) + 1);
        }

        // Count equal pairs
        int count = 0;
        for (String key : rowMap.keySet()) {
            count += rowMap.get(key) * colMap.getOrDefault(key, 0);
        }

        return count;
    }
}
