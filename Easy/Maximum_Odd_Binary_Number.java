package Easy;

public class Maximum_Odd_Binary_Number {
    public String maximumOddBinaryNumber(String s) {
        if (s.length() == 1) return "1";
        int count = -1;
        for (char digit : s.toCharArray()){
            if (digit == '1') count++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++){
            if (i < count){
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        sb.append("1");
        return sb.toString();
    }
}
