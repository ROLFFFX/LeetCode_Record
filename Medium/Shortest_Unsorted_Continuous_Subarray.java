package Medium;

public class Shortest_Unsorted_Continuous_Subarray {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15}; //5
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {2,1};
        int ans = findUnsortedSubarray(nums3);
        System.out.println(ans);
    }
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length - 1;
        int left = -1;
        int right = -1;
        int max = nums[0];
        int min = nums[len];
        for (int i = 1; i <= len; i++){
            int a = nums[i];
            int b = nums[len - i];
            if (a < max){
                right = i;
            } else {
                max = a;
            }
            if (b > min){
                left = i;
            } else {
                min = b;
            }
        }
        return Math.max(0, left + right - len + 1);
    }
}
