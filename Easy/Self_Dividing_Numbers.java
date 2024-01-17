package Easy;

import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList();
        for (int i = left; i <= right; i++){
            if (isDiv(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    // check if i is divisible by all of its digits
    public static boolean isDiv(int number) {
        int storingNumber = number;
        while (number != 0) {
            int r = number % 10;
            if (r == 0) return false;
            if (!(storingNumber % r == 0)) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
