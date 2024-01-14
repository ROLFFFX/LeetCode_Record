package Hard;

import java.util.ArrayList;
import java.util.List;

public class Find_Beautiful_Indices_in_the_Given_Array_II {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aIndices = kmpSearch(s, a);
        List<Integer> bIndices = kmpSearch(s, b);
        List<Integer> beautifulIndices = new ArrayList<>();

        int j = 0; // Pointer for bIndices
        for (int i : aIndices) {
            // Advance j to be within k distance from i
            while (j < bIndices.size() && bIndices.get(j) < i - k) {
                j++;
            }
            // Check if the current bIndices[j] is within k distance from i
            if (j < bIndices.size() && bIndices.get(j) <= i + k) {
                beautifulIndices.add(i);
            }
        }

        return beautifulIndices;
    }

    private List<Integer> kmpSearch(String s, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int[] lps = computeLPSArray(pattern);
        int i = 0; // index for s
        int j = 0; // index for pattern

        while (i < s.length()) {
            if (pattern.charAt(j) == s.charAt(i)) {
                j++;
                i++;
            }
            if (j == pattern.length()) {
                occurrences.add(i - j);
                j = lps[j - 1];
            } else if (i < s.length() && pattern.charAt(j) != s.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
        return occurrences;
    }

    private int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = length;
                    i++;
                }
            }
        }
        return lps;
    }
}
