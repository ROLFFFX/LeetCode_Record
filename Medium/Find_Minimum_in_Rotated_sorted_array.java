package Medium;

public class Find_Minimum_in_Rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    /** wow first attempt **/
    public static int findMin(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            int next = nums[i+1];
            if (curr > next){
                return next;
            }
        }
        return nums[0];
    }
}
