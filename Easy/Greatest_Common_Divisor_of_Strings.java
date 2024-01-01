package Easy;

public class Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        int end = gcd(str1.length(), str2.length());
        return str1.substring(0, end);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
