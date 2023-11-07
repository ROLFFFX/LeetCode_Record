package Medium;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};  //{24,12,8,6}
        int[] nums2 = {-1,1,0,-3,3};    //{[0,0,9,0,0]}
        int[] ans = productExceptSelf(nums2);
        System.out.println();
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int curr = 1;
        Arrays.fill(ans, 1);
        for (int i = 0; i < len; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = len - 1; i >= 0 ; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
