package Easy;

public class Base_7 {
    public String convertToBase7(int num) {
        int base = 1, result = 0;
        while (num != 0){
            result += base * (num % 7);
            num /= 7;
            base *= 10;
        }
        return String.valueOf(result);
    }
}
