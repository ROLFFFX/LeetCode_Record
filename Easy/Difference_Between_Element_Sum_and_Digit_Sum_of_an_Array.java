package Easy;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digit_sum = 0;
        for (int num : nums){
            sum += num;
            while (num != 0){
                digit_sum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - digit_sum);
    }
}
