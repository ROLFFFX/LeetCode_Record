package Medium;

import java.util.HashMap;

public class Longest_Palindrome_by_Concatenating_Two_Letter_Words {
    public int longestPalindrome(String[] words) {
        int count = 0;
        boolean hasOddPalindrome = false;
        HashMap<String, Integer> map = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                // Handle palindromic word
                if (map.get(word) % 2 == 0) {
                    count += map.get(word) * 2; // Use all pairs
                } else {
                    hasOddPalindrome = true;
                    count += (map.get(word) - 1) * 2; // Use all but one
                }
            } else if (map.containsKey(reversed)) {
                // Handle pairs of complementary words
                int pairs = Math.min(map.get(word), map.get(reversed));
                count += pairs * 4; // Each pair contributes 4 to the length
                map.put(reversed, 0); // Mark as processed
            }
        }

        if (hasOddPalindrome) count += 2; // Place a unique palindromic word in the center if available
        return count;
    }
}
