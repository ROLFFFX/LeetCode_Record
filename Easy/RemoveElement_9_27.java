package Easy;

import java.util.ArrayList;

public class RemoveElement_9_27 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 2;
        int val = 3;
        int ans = removeElement(nums, val); //2
        System.out.println();// nums = [2,2]
    }

    /** the optimized ver. eliminates the O(n) operation where removedIndex array is generated **/
    public static int removeElement(int[] nums, int val) {

        int arr_i = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[arr_i] = nums[i];
                arr_i++;
            }
        }
        return arr_i;
    }

    /** this first ver. works but it's slow**/
//    public static int removeElement(int[] nums, int val) {
//        ArrayList<Integer> removedIndex= new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val){removedIndex.add(i);}
//        }
//
//        int arr_i = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (!removedIndex.contains(i)){
//                nums[arr_i] = nums[i];
//                arr_i++;
//            }
//        }
//        return nums.length - removedIndex.size();
//    }
    //edge case handling: first element is to be removed.
    //non edge case cycle: iterate through array, when index is a removed index, switch place with the first
    //element encountered that does not going to be removed.

    //[3,3,2,3],3
    //[3,2,3,2],2
    //[2,3,2,3],3
}
