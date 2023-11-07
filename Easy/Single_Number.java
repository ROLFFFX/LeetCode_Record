package Easy;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};
    }
    public static int singleNumber(int[] nums) {
        int single = 0; // Start with 0 since x ^ 0 = x

        for (int num : nums) {
            single ^= num; // XOR every number in the array
        }

        return single; // The result is the number that appears once
    }
}
