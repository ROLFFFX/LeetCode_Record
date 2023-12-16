package Medium;

public class Maximum_Product_Subarray {
    public static void main(String[] args) {
//        int [] nums = {2,3,-2,4};
//        int [] nums = {-1,0,-2};
        int[] nums = {0,2};
        int ans = maxProduct(nums);

        System.out.println(ans);
    }
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        int testMaxProd, testMinProd;
        for (int i = 1; i < nums.length; i++) {
            testMaxProd = maxProd * nums[i];
            testMinProd = minProd * nums[i];

            maxProd = Math.max(Math.max(testMaxProd, testMinProd), nums[i]);
            minProd = Math.min(Math.min(testMaxProd, testMinProd), nums[i]);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}
