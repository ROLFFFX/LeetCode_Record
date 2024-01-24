package Easy;

public class Sum_of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays_optimized(int[] A) {
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * A[i];
        }
        return res;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int len = 1;
        int sum = 0;
        while (len <= arr.length){
            int i = 0;
            int window = 0;
            for (; i < len; i++){
                window += arr[i];
            }
            sum += window;
            int k = 0;
            for (int j = i; j < arr.length; j++){
                window -= arr[k++];
                window += arr[j];
                sum += window;
            }
            len+=2;
        }
        return sum;
    }
}
