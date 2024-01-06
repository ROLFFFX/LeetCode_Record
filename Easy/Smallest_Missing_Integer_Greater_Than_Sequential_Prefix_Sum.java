package Easy;

public class Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public int missingInteger(int[] nums) {
        // find longest sequential prefix sum
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        // adjust to smallest non existing integer
        while (contains(nums, sum)) {
            sum++;
        }
        return sum;
    }


    public boolean contains(int[] nums, int number) {
        for (int num : nums) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
