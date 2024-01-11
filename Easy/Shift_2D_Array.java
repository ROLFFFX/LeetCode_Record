package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shift_2D_Array {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list = new ArrayList();
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                list.add(grid[i][j]);
            }
        }
        //shift list n times;
        Collections.rotate(list, k % list.size());
        int index = 0;
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                currentRow.add(list.get(index++));
            }
            matrix.add(currentRow);
        }

        return matrix;
    }
}
