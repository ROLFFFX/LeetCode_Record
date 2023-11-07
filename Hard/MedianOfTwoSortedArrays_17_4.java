package Hard;

public class MedianOfTwoSortedArrays_17_4 {
    public static void main(String[] args) {
        int[] nums1 = new int[2];
        nums1[0] = 1;
        nums1[1] = 3;
        int[] nums2 = new int[2];
        nums2[0] = 2;
        nums2[1] = 4;
//        nums2[2] = 5;
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }

    //guaranteed to have at least one item
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];
    }
    }
//        int len_1 = nums1.length;
//        int len_2 = nums2.length;
//        int total_len = len_1 + len_2;
//        /** Two cases: array is odd, array is even.**/
//        if (total_len % 2 == 1){
//            return handleOddArr(nums1, nums2, total_len);
//        } else {
//            return handleEvenArr(nums1, nums2, total_len);
//        }
//    }
//
//    public static double handleOddArr(int[] nums1, int[] nums2, int total_len){
//        //edge case: only has one item. return it right away.
//        int target_index = total_len / 2;
//        int c = 0;
//        int nums1_ptr = 0;
//        int nums2_ptr = 0;
//        int[] return_nums = new int[target_index+1];
//        while (c <= target_index){
//            if (nums1[nums1_ptr] < nums2[nums2_ptr]){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//            } else if (nums1[nums1_ptr] > nums2[nums2_ptr]){
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums1[nums1_ptr] == nums2[nums2_ptr]){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums1_ptr == nums1.length){
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums2_ptr == nums2.length){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//            }
//        }
//        return return_nums[return_nums.length-1];
//    }
//
//    public static double handleEvenArr(int[] nums1, int[] nums2, int total_len){
//        int target_index = (total_len / 2); //item at ((t_i)+(t_i - 1))/2 is the median.
//        int c = 0;
//        int nums1_ptr = 0;
//        int nums2_ptr = 0;
//        int[] return_nums = new int[target_index+1];
//        while (c <= target_index){
//            if (nums1[nums1_ptr] < nums2[nums2_ptr]){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//            } else if (nums1[nums1_ptr] > nums2[nums2_ptr]){
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums1[nums1_ptr] == nums2[nums2_ptr]){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums1_ptr == nums1.length){
//                return_nums[c] = nums2[nums2_ptr];
//                nums2_ptr++;
//                c++;
//            } else if (nums2_ptr == nums2.length){
//                return_nums[c] = nums1[nums1_ptr];
//                nums1_ptr++;
//                c++;
//            }
//        }
//        double ans = (return_nums[return_nums.length - 1] + return_nums[return_nums.length - 2]) / 2 ;
//        double ans2 = ans/2;
//        return ans2;
//    }

//    public static double findMedianOddArr()
        /** First Attempt beats 16.2% **/
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        ArrayList<Integer> arr = new ArrayList();
//        for (int i = 0; i < nums1.length; i++) {
//            arr.add(nums1[i]);
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            arr.add(nums2[i]);
//        }
//        Collections.sort(arr);
//
//        if ((double)arr.size() % 2 == 1.0){
//            return (double)arr.get(arr.size()/2);
//        }
//        return ((double)arr.get(arr.size()/2 - 1)+(double)arr.get(arr.size()/2))/2;
//    }
//}
