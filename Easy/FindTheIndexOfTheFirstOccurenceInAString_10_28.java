package Easy;

public class FindTheIndexOfTheFirstOccurenceInAString_10_28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(checkWord(haystack,needle,0));

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()){
            return -1;
        }
        char starter = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == starter){
                if (checkWord(haystack, needle, i)){
                    return i;
                }
            }
        }
        return -1;   //dummy
    }

    public static boolean checkWord(String haystack, String needle, int index){
        int length = needle.length();
        if (length + index > haystack.length()){
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (haystack.charAt(index) != needle.charAt(i)){
                return false;
            }
            index++;
        }
        return true;
    }


    /** This one is fast and good I guess**/
//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
}
