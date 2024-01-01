package Easy;

public class Three_Divisors {
    public boolean isThree(int n) {
        int count = 0;
        int d = 1;
        while (d <= n && count <= 3){
            if (n % d == 0){
                count++;
            }
            d++;
        }
        if (count == 3){
            return true;
        }
        return false;
    }
}
