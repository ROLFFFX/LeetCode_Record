package Easy;

public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int num : nums){
            if (String.valueOf(num).length() % 2 == 0) c++;
        }
        return c;
    }
}
