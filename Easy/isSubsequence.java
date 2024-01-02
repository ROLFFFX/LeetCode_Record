package Easy;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int i = 0;
        int j = 0;
        int c = 0;
        while (i < s1.length){
            char curr = s1[i];
            while (j < t1.length){
                if (curr == t1[j]){
                    c++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        return c == s1.length;
    }

    // public boolean isSubsequence(String s, String t) {
    //     int s_p = 0;
    //     int t_p = 0;
    //     int count = 0;
    //     for (; s_p < s.length(); s_p++){
    //         char curr = s.charAt(s_p);
    //         for (; t_p < t.length(); t_p++){
    //             if (t.charAt(t_p) == curr){
    //                 count++;
    //                 t_p++;
    //                 break;
    //             }
    //         }
    //     }
    //     return count == s.length();
    // }
}
