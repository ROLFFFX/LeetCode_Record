package Easy;

public class Percentage_of_Letter_in_String {
    public int percentageLetter(String s, char letter) {
        int[] bucket = new int[26];
        for (char c : s.toCharArray()) {
            bucket[c - 'a']++;
        }
        return bucket[letter - 'a'] == 0 ? 0 : bucket[letter - 'a'] * 100 / s.length();
    }
}
