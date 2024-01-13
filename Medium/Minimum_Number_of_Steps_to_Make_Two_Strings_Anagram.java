package Medium;

public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {
    public int minSteps(String s, String t) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) alphabet[c - 'a']++;
        for (char c : t.toCharArray()) alphabet[c - 'a']--;
        int ans = 0;
        for (int n : alphabet) {
            if (n > 0) ans += n;
        }
        return ans;
    }
}
