package Easy;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = ans.length - 1;
        for (int num : nums){
            if (num % 2 == 0){
                ans[i++] = num;
            } else {
                ans[j--] = num;
            }
        }
        return ans;
    }
}
