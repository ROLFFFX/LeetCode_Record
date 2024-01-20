package Medium;

public class Find_if_Array_Can_Be_Sorted {
    public boolean canSortArray(int[] nums) {
        while (true) {
            boolean swapped = false;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    if (Integer.bitCount(nums[i]) == Integer.bitCount(nums[i + 1])) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        swapped = true;
                        break;
                    } else {
                        return false;
                    }
                }
            }
            if (!swapped) {
                return true;
            }
        }
    }
}
