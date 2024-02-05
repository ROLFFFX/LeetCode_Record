package Easy;

public class Substrings_of_Size_Three_with_Distinct_Characters {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++){
            if (check(s.substring(i - 1, i + 2))){
                count++;
            }
        }
        return count;
    }

    public boolean check(String s){
        return (s.charAt(0) != s.charAt(1))
                && (s.charAt(1) != s.charAt(2))
                && (s.charAt(0) != s.charAt(2));
    }
}
