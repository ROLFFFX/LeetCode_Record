package Easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        System.out.println();
    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 1){  //set Base Case
            List<List<Integer>> result = new ArrayList<>();
            List base = new ArrayList();
            base.add(1);
            result.add(base);
            return result;
        }
        List<List<Integer>> prev_rows = generate(numRows - 1);
        List<Integer> curr_row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            curr_row.add(1);
        }
        List<Integer> prev_row = prev_rows.get(numRows - 2);
        for (int i = 1; i < numRows - 1; i++) {
             int value = prev_row.get(i - 1) + prev_row.get(i);
             curr_row.set(i, value);
        }
        prev_rows.add(curr_row);
        return prev_rows;
    }

    //given number of rows, return that rows of pascals triangle
//    public static List<List<Integer>> generate(int numRows) {
//        /** Edge Case: num rows is 0. **/
//        if (numRows == 0){return new ArrayList<>();}
//        /** Base Case: num rows is 1, return [[1]]**/
//        if (numRows == 1){
//            List<List<Integer>> result = new ArrayList<>();
//            ArrayList ini = new ArrayList();
//            ini.add(1);
//            result.add(ini);
//            return result;
//        }
//        /** Get Prev Rows**/
//        List<List<Integer>> prevRows = generate(numRows - 1);
//        List<Integer> newRow = new ArrayList<>();
//        /** Populate current row with 1. **/
//        for (int i = 0; i < numRows; i++) {
//            newRow.add(1);
//        }
//
//        for (int i = 1; i < numRows - 1; i++) {
//            List<Integer> lastRow = prevRows.get(numRows - 2);
//            int valueAboveLeft = lastRow.get(i - 1); // Value from the previous row, left position
//            int valueAboveRight = lastRow.get(i); // Value from the previous row, right position
//            int newValue = valueAboveLeft + valueAboveRight;
//            newRow.set(i, newValue);
//        }
//
//        prevRows.add(newRow);
//        return prevRows;
//    }

}
