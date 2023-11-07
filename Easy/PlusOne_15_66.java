package Easy;

public class PlusOne_15_66 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 9 - i;
        }

        int[] arr_999 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr_999[i] = 9;
        }

        int[] c = plusOne(arr);
        System.out.println();
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        } else {
            for (int i = digits.length - 1; i >= 1 ; i--) {
                if (digits[i] != 9){
                    digits[i] += 1;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
            //for first digit
            if (digits[0]!=9){
                digits[0]+=1;
                return digits;
            } else {    //for case first digit is one
                int[] digits_copy = new int[digits.length+1];
                for (int i = 0; i < digits.length; i++) {
                    digits_copy[i+1] = digits[i];
                }
                digits_copy[0] = 1;
                digits_copy[1] = 0;
                return digits_copy;
            }
        }
    }



//    public static int[] plusOne(int[] digits) {
//        int c = arr_to_int(digits) + 1;
//        return int_to_arr(c);
//    }
//
//    public static int[] int_to_arr(int c){
//        String s = String.valueOf(c);
//        int[] return_arr = new int[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            return_arr[i] = s.charAt(i) - '0';
//        }
//        return return_arr;
//    }
//
//    public static int arr_to_int(int[] digits){
//        String s = "";
//        for (int i = 0; i < digits.length; i++) {
//            s += digits[i];
//        }
//        long num = Long.parseLong(s);
//        return (int)(num % (1L + Integer.MAX_VALUE));
//    }


//    public static int[] plusOne(int[] digits) {
//        int c = int_arr_to_int(digits);
//        return int_to_int_arr(c+1);
//    }
//
//    public static int int_arr_to_int(int[] digits){
//        StringBuilder sb = new StringBuilder();
//        for (int num : digits) {
//            sb.append(num);
//        }
//        return Integer.parseInt(sb.toString());
//    }
//
//    public static int[] int_to_int_arr(int number){
//        String numStr = Integer.toString(number);
//        int[] result = new int[numStr.length()];
//        for (int i = 0; i < numStr.length(); i++) {
//            result[i] = numStr.charAt(i) - '0';
//        }
//        return result;
//    }
}
