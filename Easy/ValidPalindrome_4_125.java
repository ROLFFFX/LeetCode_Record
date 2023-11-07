package Easy;

public class ValidPalindrome_4_125 {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "baaaaab";
        System.out.println(isPalindrome(s));
    }

    /** isLetterOrDigit() is faster than replaceAll(regex)**/
    public static boolean isPalindrome(String s) {
        if (s.isBlank()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}

        //first attempt
//    public static boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");;
//        int len = s.length();
//        int len_1 = len;
//        int i = 0;
//        while (i < len_1/2){
//            if (s.charAt(i) != s.charAt(len-1)){
//                return false;
//            }
//            i++;
//            len--;
//        }
//        return true;
//    }
//}
