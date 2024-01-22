package Medium;

public class Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int num : nums){
            if (num < 0){
                ans[neg] = num;
                neg += 2;
            } else {
                ans[pos] = num;
                pos += 2;
            }
        }
        return ans;
    }
}
