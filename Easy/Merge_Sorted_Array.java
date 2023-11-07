package Easy;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,0,0};
        int[] nums2 = {1,2};
        int m = 3;
        int n = 2;

        merge(nums1, m, nums2, n);
        System.out.println();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;   // ptr for nums1
        int ptr2 = n - 1;   // ptr for nums2
        int ptr3 = m + n - 1;   // ptr for item to be placed
        while (ptr2 >= 0){  // traverse ptr2 from back
            // compare items on fringe. Place item on nums1 accordingly/
            if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]){
                nums1[ptr3] = nums1[ptr1];
                ptr3--;
                ptr1--;
            } else {
                nums1[ptr3] = nums2[ptr2];
                ptr3--;
                ptr2--;
            }
        }
        }
    }

    /** Attempt 1: it's cheating**/
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (n == 0){return;}
//        int j = 0;
//        for (int i = m; i < nums1.length; i++){
//            nums1[i] = nums2[j];
//            j++;
//        }
//        Arrays.sort(nums1);
//    }
//}
