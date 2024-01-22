package Easy;

public class Find_the_Array_Concatenation_Value {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            String val = String.valueOf(nums[i++]) + String.valueOf(nums[j--]);
            sum += Long.valueOf(val);
        }
        if (i == j){
            sum += (long)nums[i];
        }
        return sum;
    }
}
