package Medium;

import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // Initialize set to store results.
        Set<List<Integer>> result = new HashSet<>();
        if(nums.length<=0) return new ArrayList<>();
        // Sort nums.
        Arrays.sort(nums);
        // i is start of nums. j is one step after i. k is last bit of array.
        for(int i=0; i<nums.length-2; i++) {
            int j=i+1;
            int k=nums.length-1;
            // when k and j did not overlap
            while(k>j) {
                // current sum is sum of three
                int sum = nums[j] + nums[k] + nums[i];
                // add to result if condition satisfied
                if(sum == 0)
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                // if sum is too big, find smaller positive bit
                else if (sum > 0)
                    k--;
                // if sum is too small, find greater negative bit
                else
                    j++;
            }
            // iterate i
        }
        return new ArrayList(result);
    }
}
