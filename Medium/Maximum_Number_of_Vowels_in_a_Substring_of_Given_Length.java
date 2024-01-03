package Medium;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int max = 0;
        // first window
        for (int i = 0; i < k; i++){
            if (isVowel(s.charAt(i))){
                max++;
            }
        }

        int curr_max = max;
        for (int i = 1; i <= s.length() - k; i++){
            if (isVowel(s.charAt(i - 1))){
                curr_max--;
            }
            if (isVowel(s.charAt(i + k - 1))){
                curr_max++;
            }
            max = Math.max(max, curr_max);
        }
        return max;
    }

    public boolean isVowel(char c){
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }
}
