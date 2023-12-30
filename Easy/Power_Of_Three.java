package Easy;

public class Power_Of_Three {
    public boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }
        while (n > 1){
            if (n % 3 == 0){
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }
}
