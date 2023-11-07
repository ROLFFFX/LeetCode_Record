package Easy;

import java.util.Arrays;

public class LongestCommonPrefix_3_14 {
    public static void main(String[] args) {
        String[] strs = new String[4];
        strs[0] = "flowers";
        strs[1] = "flow";
        strs[2] = "flight";
        strs[3] = "fzo";

//        strs[0] = "dog";
//        strs[1] = "racer";
//        strs[2] = "car";
        System.out.println("test:"+longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String return_val = "";
        int i = 0;
        int len = strs.length;
        String first = strs[0];
        String last = strs[len-1];
        while (i<first.length()){
            if (first.charAt(i) == last.charAt(i)){
                return_val += first.charAt(i);
            } else {break;}
            i++;
        }
        return return_val;
    }
}

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length==0){
//            return "";
//        }
//        String return_str = "";
//        int strs_len = strs.length; //number of strings
//        int charAt_i = 0; //digit iterator
//        while (true) {
//            int strs_i = 0;
//            while (strs_i < strs_len - 1){
//                if (strs[strs_i].charAt(charAt_i) != strs[strs_i+1].charAt(charAt_i)){
//                    break;
//                }
//                strs_i++;
//            }
//            if (strs_i+1 == strs_len){
//                return_str+=strs[strs_i].charAt(charAt_i);
//            } else {
//                break;
//            }
//            charAt_i++;
//        }
//        return return_str;
//    }
//}
