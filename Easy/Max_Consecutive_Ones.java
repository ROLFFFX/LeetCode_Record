package Easy;

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                int curr_max = 0;
                for (; i < nums.length; i++){
                    if (nums[i] == 1){
                        curr_max++;
                    } else {
                        break;
                    }
                }
                max = Math.max(max, curr_max);
            }
        }
        return max;
    }
}
