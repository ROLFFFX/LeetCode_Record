package Easy;

public class Find_the_Middle_Index_in_Array {
    public int findMiddleIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) right+=nums[i];
        // expand on left, shrink on right
        if (left == right) return 0;
        for (int i = 1; i < nums.length; i++){
            left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }
}
