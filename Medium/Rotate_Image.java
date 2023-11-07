package Medium;

import java.sql.SQLOutput;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix_2d = {{1,2},{3,4}};
        int[][] matrix_3d = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix_4d = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix_3d);
        System.out.println();
    }

    public static void rotate(int[][] matrix){
        // first transpose the matrix in place.
        // traverse upper triangle
        int n = matrix[0].length;
        for (int row = 0; row < n; row++){
            for (int col = row+1; col < n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        // second flip the matrix in place.
        for (int row = 0; row < n; row++){
            // traverse each row
            for (int col = 0; col < n/2; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n - col - 1];
                matrix[row][n - col - 1] = temp;
            }
        }
    }
}
