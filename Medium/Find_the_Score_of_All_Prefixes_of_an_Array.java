package Medium;

public class Find_the_Score_of_All_Prefixes_of_an_Array {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        long max = Integer.MIN_VALUE;
        long conver = 0;
        for (int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
            conver += max + nums[i];
            ans[i] = conver;
        }
        return ans;
    }
}
