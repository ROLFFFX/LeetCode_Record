package Medium;

public class Maximum_Sum_of_an_Hourglass {
    public int maxSum_optimized(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int max = Integer.MIN_VALUE;

        // Precompute the sums of three elements in a row
        int[][] rowSums = new int[rows][cols - 2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                rowSums[i][j] = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
            }
        }

        // Compute hourglass sums using precomputed rowSums
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                int sum = rowSums[i][j] + grid[i + 1][j + 1] + rowSums[i + 2][j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= grid.length - 3; i++){
            for (int j = 0; j <= grid[0].length - 3; j++){
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] +
                        grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
