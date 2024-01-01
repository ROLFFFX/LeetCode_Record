package Medium;

public class Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int num : nums){
            if (num < min){
                min = num;
            } else if (num < mid && num > min){
                mid = num;
            } else if (num > mid){
                return true;
            }
        }
        return false;
    }
}
