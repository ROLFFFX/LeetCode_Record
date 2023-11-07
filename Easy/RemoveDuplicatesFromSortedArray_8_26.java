package Easy;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicatesFromSortedArray_8_26 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = -3;
        nums[1] = -1;
        nums[2] = 0;
        nums[3] = 0;
        nums[4] = 0;
        nums[5] = 3;
        nums[6] = 3;
        nums[7] = 3;
        nums[8] = 3;
        nums[9] = 4;
        System.out.println(removeDuplicates(nums));
        System.out.println();
    }
        public static int removeDuplicates(int[] nums) {
            int duplicateIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[duplicateIndex]) {
                    nums[++duplicateIndex] = nums[i];
                }
            }
            return duplicateIndex + 1;
        }

/** second try, still slow**/
//    public static int removeDuplicates(int[] nums) {
//        ArrayList record = new ArrayList<Integer>();
//        ArrayList indexRecord = new ArrayList();    //keeps track of index of items need to be skipped
//        for (int i = 0; i < nums.length; i++) {
//            if (!record.contains(nums[i])){
//                record.add(nums[i]);
//            } else {
//                indexRecord.add(i);
//            }
//        }
//        for (int i = 0; i < record.size(); i++) {
//            nums[i] = (int)record.get(i);
//        }
//        return nums.length - indexRecord.size();
//    }

    //syon150702


/** hash set does not preserve order and it's too slow to sort that again**/
//    public static int removeDuplicates(int[] nums){
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int i = 0;
//        set.stream().sorted();
//        for (int num : set) {
//            nums[i++] = num;
//        }
//        int[] new_arr = set.stream().mapToInt(Integer::intValue).toArray();
//        Arrays.sort(new_arr);
//        for (int j = 0; j < set.size(); j++) {
//            nums[j] = new_arr[j];
//        }
//
//        return set.size();
//    }



    /** this will quickly return the difference, but will not alter the former array **/
//    public static int removeDuplicates(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        nums = set.stream().mapToInt(Integer::intValue).toArray();
//
//        return nums.length;
//    }
}
