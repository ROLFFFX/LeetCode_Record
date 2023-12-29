package Medium;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        Longest_Repeating_Character_Replacement solution = new Longest_Repeating_Character_Replacement();
        System.out.println(solution.characterReplacement("AABABBA", 1)); // Example test case
    }

//    You are given a string s and an integer k. You can choose any character of the
//    string and change it to any other uppercase English character. You can perform
//    this operation at most k times.
//
//    Return the length of the longest substring containing the same letter you can
//    get after performing the above operations.


    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Array to keep count of each character
        int maxCount = 0; // Maximum count of a single character in the current window
        int maxLength = 0; // Maximum length of the window
        int left = 0; // Left pointer of the window

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            // If the current window size minus the count of the most frequent character is greater than k
            if (right - left + 1 - maxCount > k) {
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
