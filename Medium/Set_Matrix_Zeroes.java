package Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix_1 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix_2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] matrix_3 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix_3);
        System.out.println();
    }

    /**90% time, 33% MEMORY**/
    public static void setZeroes(int[][] matrix) {
        // first traverse each row and mark columns needs to be zeroed.
        HashSet<Integer> row_marked = new HashSet<>();
        HashSet<Integer> col_marked = new HashSet<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0){
                    row_marked.add(i);
                    col_marked.add(j);
                }
            }
        }
        // after first traversal, we have the row and cols needs to be zeroed.
        // zero out rows accordingly
        for (int i = 0; i < row; i++) {
            if (row_marked.contains(i)){
                //zero out this row
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //zero out cols accordingly
        for (int i = 0; i < col; i++) {
            if (col_marked.contains(i)) {
                for (int j = 0; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

    /** First Attempt**/
//    public static void setZeroes(int[][] matrix) {
//        List<Integer> row_marked = new ArrayList<>();
//        List<Integer> col_marked = new ArrayList<>();
//        int row = matrix.length;
//        int col = matrix[0].length;
//        for (int i = 0; i < row && !row_marked.contains(i); i++) {
//            for (int j = 0; j < col && !col_marked.contains(j); j++) {
//                // if 0, set entire col and row to 0 and add to marked list.
//                if (matrix[i][j] == 0){
//                    setZeroes_aux(matrix, i, j);
//                    row_marked.add(i);
//                    col_marked.add(j);
//                    break;
//                }
//            }
//        }
//    }
//    public static void setZeroes_aux(int[][] matrix, int row, int col){
//        //given a matrix and i, j, set i,j to 0
//        for (int i = 0; i < matrix[0].length; i++) {    //set entire row to 0
//            matrix[row][i] = 0;
//        }
//        for (int i = 0; i < matrix.length; i++) {   //set entire column to 0
//            matrix[i][col] = 0;
//        }
//    }
}

