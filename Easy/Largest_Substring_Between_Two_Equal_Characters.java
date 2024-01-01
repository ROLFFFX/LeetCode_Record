package Easy;

public class Largest_Substring_Between_Two_Equal_Characters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (int i = 0; i < s.length(); i++){
            for (int j = s.length() - 1; j >= 0; j--){
                if (s.charAt(i) == (s.charAt(j))){
                    max = Math.max (max, j - i - 1);
                    break;
                }
            }
        }
        return max;
    }
}
