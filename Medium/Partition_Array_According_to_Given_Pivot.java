package Medium;

import org.w3c.dom.ls.LSOutput;

public class Partition_Array_According_to_Given_Pivot {
    public static void main(String[] args) {
        Partition_Array_According_to_Given_Pivot solution = new Partition_Array_According_to_Given_Pivot();
        System.out.println(pivotArray(new int[]{9,12,5,10,14,3,10}, 10));

    }

    public int[] pivotArray_optimized(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            if (left > right) break;
            if (nums[i] < pivot){
                ans[left++] = nums[i];
            }
            if (nums[nums.length - 1 - i] > pivot){
                ans[right--] = nums[(nums.length - 1) - i];
            }
        }
        while (left <= right){
            ans[left++] = pivot;
            ans[right--] = pivot;
        }
        return ans;
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 1;
        for (int num : nums){
            if (num < pivot){
                ans[i++] = num;
                j++;
            } else {
                ans[j++] = num;
            }
        }
        return ans;
    }
}
