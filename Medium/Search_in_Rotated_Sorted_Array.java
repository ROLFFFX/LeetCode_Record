package Medium;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,1,3};
        int target = 3;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }


        /** First Attempt not success **/
//    public static int search(int[] nums, int target) {
//        int starting_index = 0;
//        // 1. find starting index
//        for (int i = 0; i < nums.length - 1; i++) {
//            int curr = nums[i];
//            int next = nums[i+1];
//            if (curr > next){
//                starting_index = i+1;
//            }
//        }
//        // now, starting index is set correctly.
//        // 2. find target
//        for (int i = starting_index; i < nums.length; i++) {
//            if (nums[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
}
