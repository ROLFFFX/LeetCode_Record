package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};    //T
        int[] nums2 = {1,2,3,4};    //F
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};    //T
        boolean ans = containsDuplicate(nums3);
        System.out.println();
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num) && map.get(num) >= 1){
                return true;
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return false;
    }

    /** Accepted 38% **/
//    public static boolean containsDuplicate(int[] nums) {
//        HashSet set = new HashSet();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        return nums.length != set.size();
//    }

    /** Second Attempt BitWise **/
//    public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if ((nums[i] ^ nums[j]) == 0){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    /** First Attempt does not handle 100k+ items array **/
//    public static boolean containsDuplicate(int[] nums) {
//        if (nums.length == 0 || nums.length == 1){return false;}
//        boolean flag = false;
//        for (int i = 0; i < nums.length; i++) {
//            int curr = nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                if (curr == nums[j]){
//                    flag = true;
//                }
//            }
//        }
//        return flag;
//    }
}
