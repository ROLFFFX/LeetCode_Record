package Easy;

public class LengthOfLastWord_14_58 {
    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' '){
                count++;
            } else if (count > 0){
                return count;
            }
        }
        return count;
    }




/** beat 8% of users**/
//    public static int lengthOfLastWord(String s) {
//        if (s.replaceAll(" ", "").length() == 1){return 1;}
//        boolean flag = false;
//        int count = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i)!=' '){flag = true;}
//            if (flag && s.charAt(i)!=' '){
//                count++;
//            }
//            if (flag && s.charAt(i) == ' '){
//                return count;
//            }
//        }
//        return s.length();
//    }
}
