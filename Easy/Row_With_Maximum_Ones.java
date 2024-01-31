package Easy;

public class Row_With_Maximum_Ones {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[]{0,0}; // row, index
        for (int i = 0; i < mat.length; i++){
            // for each row
            int count = 0;
            // index = i
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 1) count++;
            }
            if (count > ans[1]){
                ans[0] = i;
                ans[1] = count;
            }
        }
        return ans;
    }
}
