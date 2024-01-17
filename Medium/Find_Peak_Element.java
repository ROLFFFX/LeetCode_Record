package Medium;

public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                if (nums[i] > nums[i+1]) return 0;
            }
            if (i == nums.length - 1){
                if (nums[i - 1] < nums[i]) return i;
            }
            if (nums[i] > nums[i + 1] && nums[i - 1] < nums[i]){
                return i;
            }
        }
        return -1;
    }
}
