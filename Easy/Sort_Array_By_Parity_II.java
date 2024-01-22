package Easy;

public class Sort_Array_By_Parity_II {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++){
            if (nums[i] % 2 == 0){
                ans[even] = nums[i];
                even+=2;
            } else {
                ans[odd] = nums[i];
                odd+=2;
            }
        }
        return ans;
    }
}
