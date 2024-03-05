package Easy;

public class Missing_Number_In_Arithmetic_Progression {
    public int missingNumber(int[] arr) {
        int gap = (arr[arr.length - 1] - arr[0])/arr.length;
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++){
            curr += gap;
            if (arr[i] != curr){
                return curr;
            }
        }
        if (gap == 0) return curr;
        return 0;
    }
}
