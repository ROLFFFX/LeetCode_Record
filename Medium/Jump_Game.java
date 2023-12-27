package Medium;

public class Jump_Game {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums_2 = {3,2,1,0,4};
        System.out.println(canJump(nums));  //true
        System.out.println(canJump(nums_2));    //false
    }

    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reach){
                return false;
            }
            reach = Math.max(reach, i+ nums[i]);
        }
        return true;
    }
}
