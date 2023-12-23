package Easy;

public class maxScore {
//    Given a string s of zeros and ones, return the maximum score
//    after splitting the string into two non-empty substrings
//    i.e. left substring and right substring).
//
//    The score after splitting a string is the number of zeros in
//    the left substring plus the number of ones in the right substring.
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }

    // return the index of first one
    public static int find_first_one(String s){
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                return i;
            }
        }
        return -1;
    }

    public static int find_first_zero(String s){
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                return i;
            }
        }
        return -1;
    }

        /** First Attempt success but slow **/
    public static int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            int curr_max = num_zero(s.substring(0, i))
                    + num_one(s.substring(i, s.length()));
            if (curr_max >= max){
                max = curr_max;
            }
        }
        return max;
    }
    public static int num_one(String s){
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
    public static int num_zero(String s){
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                c++;
            }
        }
        return c;
    }
}
