package Easy;

public class PalindromeNumber_2_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int i = String.valueOf(x).length()-1;
        char[] c = String.valueOf(x).toCharArray();
        for (int j = 0; j < i; j++) {
            if (c[j] != c[i]){
                return false;
            }
            i--;
        }
        return true;
    }
}

    /** First Attempt**/
//    public static boolean isPalindrome(int x) {
//        String x_2="";
//        for (int i = Integer.toString(x).length() - 1; i >= 0; i--) {
//            x_2 += Integer.toString(x).charAt(i);
//        }
//
//        return Integer.toString(x).equals(x_2);
//    }
//}
