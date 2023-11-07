package Easy;

public class AddBinary_16_67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String c = addBinary(a, b);
        System.out.println();
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    /** first attempt beats 5.8% **/
//    public static String addBinary(String a, String b) {
//        int len_a = a.length();
//        int len_b = b.length();
//        int max_len = Math.max(len_a, len_b);
//        if (len_a > len_b){
//            b = addZero(b, max_len-len_b);
//        } else {
//            a = addZero(a, max_len-len_a);
//        }
//        //a and b are initialized to same digits
//        char carry = '0';
//        String s = "";
//        for (int i = max_len - 1; i >= 0; i--) {
//            String curr_digit = calculateCurrDigit(carry, a.charAt(i), b.charAt(i));
//            carry = curr_digit.charAt(0);
//            s = curr_digit.charAt(1)+s;
//        }
//        if (carry == '1'){
//            s = '1'+s;
//        }
//        return s;
//    }
//
//    public static String calculateCurrDigit(char carry, char a, char b){
//        String curr_add = ""+carry+a+b;
//        switch (curr_add){
//            case "000": return "00";    //carry = 0, curr_digit = 1;
//            case "001", "010", "100": return "01";
//            case "011", "101", "110": return "10";
//            case "111": return "11";
//        }
//        return "";
//    }
//
//    public static String addZero(String a, int x){  //add x numbers of 0 infront of a
//        return "0".repeat(x) + a;
//    }

}
