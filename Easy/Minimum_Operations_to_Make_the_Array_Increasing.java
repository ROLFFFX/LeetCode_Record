package Easy;

public class Minimum_Operations_to_Make_the_Array_Increasing {
    public int minOperations(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i=1; i<n; i++){
            if(arr[i]<=arr[i-1]){
                ans = ans + arr[i-1]-arr[i]+1;
                arr[i] = arr[i-1]+1;
            }
        }
        return ans;
    }
}
