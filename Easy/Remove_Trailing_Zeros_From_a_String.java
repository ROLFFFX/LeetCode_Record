package Easy;

public class Remove_Trailing_Zeros_From_a_String {
    public String removeTrailingZeros(String num) {
        int i = num.length() - 1;
        for (; i >= 0; i--){
            if (num.charAt(i) != '0'){
                break;
            }
        }
        return num.substring(0, i + 1);
    }
}
