package Easy;

public class Largest_Unique_Number {
    public int largestUniqueNumber(int[] nums) {
        int[] b = new int[1001];
        for (int n : nums){
            b[n]++;
        }
        for (int i = b.length - 1; i >= 0; i--){
            if (b[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
