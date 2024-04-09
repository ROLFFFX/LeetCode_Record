package Easy;

public class Check_Whether_Two_Strings_are_Almost_Equivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] bucket1 = new int[26];
        int[] bucket2 = new int[26];
        for (char c : word1.toCharArray()) {
            bucket1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            bucket2[c - 'a']++;
        }
        for (int i = 0; i < bucket1.length; i++) {
            if (Math.abs(bucket1[i] - bucket2[i]) > 3) return false;
        }
        return true;
    }
}
