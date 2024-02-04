package Medium;

public class Find_the_Grid_of_Region_Average {
    public int[][] resultGrid(int[][] image, int threshold) {
        int m = image.length, n = image[0].length;
        int[][] result = new int[m][n];
        int[][] avgMap = new int[m][n];
        int[][] countMap = new int[m][n];
        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                if (isValidRegion(image, i, j, threshold)) {
                    int sum = 0;
                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            sum += image[x][y];
                            countMap[x][y]++;
                        }
                    }
                    int avg = sum / 9;
                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            avgMap[x][y] += avg;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (countMap[i][j] > 0) {
                    result[i][j] = avgMap[i][j] / countMap[i][j];
                } else {
                    result[i][j] = image[i][j];
                }
            }
        }

        return result;
    }

    private boolean isValidRegion(int[][] image, int x, int y, int threshold) {
        for (int i = x; i < x + 2; i++) {
            for (int j = y; j < y + 2; j++) {
                if (Math.abs(image[i][j] - image[i+1][j]) > threshold ||
                        Math.abs(image[i][j] - image[i][j+1]) > threshold ||
                        Math.abs(image[i+1][j] - image[i+1][j+1]) > threshold ||
                        Math.abs(image[i][j+1] - image[i+1][j+1]) > threshold) {
                    return false;
                }
            }
        }
        return true;
    }
}
