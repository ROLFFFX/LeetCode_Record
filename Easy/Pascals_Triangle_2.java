package Easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_2 {
    public static void main(String[] args) {
        int rowIndex = 2;
        List<Integer> row = getRow(rowIndex);
        System.out.println();
    }
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }
        List<Integer> prev_row = getRow(rowIndex - 1);
        List<Integer> curr_row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            curr_row.add(1);
        }
        for (int i = 1; i < rowIndex; i++) {
            curr_row.set(i, prev_row.get(i - 1)+prev_row.get(i));
        }
        return curr_row;
    }
}
