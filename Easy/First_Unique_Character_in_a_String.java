package Easy;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] bucket = new int[26];
        for (char c : s.toCharArray()){
            bucket[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            if (bucket[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
