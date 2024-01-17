package Medium;

public class Max_Increase_to_Keep_City_Skyline {
    public int maxIncreaseKeepingSkyline_optimized(int[][] grid) {
        // store column maxes and row maxes
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                sum += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return sum;
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // find max in col and row, get min from that.
        int sum = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                sum += find(grid, row, col) - grid[row][col];
            }
        }
        return sum;
    }

    public int find(int[][] grid, int row, int col){
        // find the min in max of row and col
        // row max
        int row_max = 0;
        for (int i = 0; i < grid[0].length; i++){
            row_max = Math.max(row_max, grid[row][i]);
        }
        int col_max = 0;
        for (int i = 0; i < grid.length; i++){
            col_max = Math.max(col_max, grid[i][col]);
        }
        return Math.min(row_max, col_max);
    }
}
