package Easy;

class TwoSum_1_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (((nums[i] + nums[j]) == target)&& (i!=j)){
                    result[0] = i; result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2; nums[1] = 7; nums[2] = 11; nums[3] = 15;
        int[] result = twoSum(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
        //Test Case 2
        int[] nums_2 = new int[3];
        nums_2[0] = 3; nums_2[1] = 2; nums_2[2] = 4;
        int[] result_2 = twoSum(nums_2, 6);
        for (int i = 0; i < result_2.length; i++) {
            System.out.print(result_2[i]+" ");
        }
        System.out.println();
        //Test Case 3
        int[] nums_3 = new int[2];
        nums_3[0] = 3; nums_3[1] = 3;
        int[] result_3 = twoSum(nums_3, 6);
        for (int i = 0; i < result_3.length; i++) {
            System.out.print(result_3[i]+" ");
        }
        System.out.println();
    }
}
