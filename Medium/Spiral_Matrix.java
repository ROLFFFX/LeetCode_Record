package Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix_1 = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        int[][] matrix_2 = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
        int[][] matrix_3 = {{1,2,3,4}};
        List<Integer> ans = spiralOrder(matrix_3);
        System.out.println();
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int col = matrix[0].length;
        int row = matrix.length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        while (top <= bottom && left <= right) {
            // top left to top right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            // top right to bottom right
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // bottom right to bottom left
            if (bottom >= top) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // bottom left back to top left
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
