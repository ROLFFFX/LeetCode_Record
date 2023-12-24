package Easy;

import java.util.Stack;

public class Minimum_Changes_To_Make_Alternating_Binary_String {
    public static void main(String[] args) {
        String test = "10101";
        System.out.println(minOperations(test));
    }
    public static int minOperations(String s) {
        int count0 = 0, count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is '0' or '1' and increment the respective counter
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') {
                    count0++;
                } else {
                    count1++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        // Return the minimum of the two counts
        return Math.min(count0, count1);
    }
}
