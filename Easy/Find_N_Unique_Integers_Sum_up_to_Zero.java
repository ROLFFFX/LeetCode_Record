package Easy;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n / 2; i++){
            ans[i] = n - i;
            ans[n - i - 1] = i - n;
        }
        return ans;
    }
}
