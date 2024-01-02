package Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int sb = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                sb++;
            } else if (sb > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - sb] = temp;
            }
        }
    }
}
