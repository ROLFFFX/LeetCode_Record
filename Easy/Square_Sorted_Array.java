package Easy;

public class Square_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};   //[0,1,9,16,100]
        int[] nums2 = {-7,-3,2,3,11};   //[4,9,9,49,121]
        int[] nums3 = {1,2,3};
        int[] ans_3 = sortedSquares(nums3);
//        int[] ans_2 = sortedSquares(nums2);
        System.out.println();
    }

    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int i = 0;          //first ptr starts from start
        int j = len - 1;    //second ptr starts from back
        // compare and add from back
        for (int k = j; k >= 0; k--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[k] = nums[i] * nums[i];
                i++;
            } else {
                ans[k] = nums[j] * nums[j];
                j--;
            }
        }
        return ans;
    }

}
