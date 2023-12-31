package Easy;

import java.util.HashSet;

public class Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.add(n)){
            int total = 0;
            while (n > 0){
                total += (n % 10) * (n % 10);
                n /= 10;
            }
            if (total == 1){
                return true;
            }
            else {
                n = total;
            }
        }
        // if a cycle is found, return false
        return false;
    }
}
