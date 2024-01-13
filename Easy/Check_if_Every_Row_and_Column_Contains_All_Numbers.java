package Easy;

import java.util.HashSet;

public class Check_if_Every_Row_and_Column_Contains_All_Numbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> set = new HashSet();
        for (int i = 1; i <= n; i++){
            set.add(i);
        }
        // traverse set
        for (int i = 0; i < n; i++){
            HashSet<Integer> row = new HashSet();
            HashSet<Integer> col = new HashSet();
            for (int j = 0; j < n; j++){
                row.add(matrix[i][j]);
                col.add(matrix[j][i]);
            }
            if (!row.equals(set)) return false;
            if (!col.equals(set)) return false;
        }
        return true;
    }
}
