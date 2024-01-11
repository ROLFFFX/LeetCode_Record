package Medium;

public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        char[] box = boxes.toCharArray();
        for (int i = 0; i < box.length; i++){
            // for each digit in input
            int curr_sum = 0;
            for (int j = 0; j < box.length; j++){
                if (j == i) continue;
                if (box[j] == '0') continue;
                curr_sum += Math.abs(j - i);
            }
            ans[i] = curr_sum;
        }
        return ans;
    }
}
