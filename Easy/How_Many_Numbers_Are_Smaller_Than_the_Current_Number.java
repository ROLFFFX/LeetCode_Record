package Easy;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (curr > nums[j]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
