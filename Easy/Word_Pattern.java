package Easy;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWordMap.containsKey(c)) {
                if (wordToCharMap.containsKey(word)) {
                    return false;
                }
                charToWordMap.put(c, word);
                wordToCharMap.put(word, c);
            } else if (!charToWordMap.get(c).equals(word)) {
                return false;
            }
        }

        return true;
    }
}
