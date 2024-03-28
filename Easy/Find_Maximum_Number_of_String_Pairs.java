package Easy;

public class Find_Maximum_Number_of_String_Pairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int c = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++){
                if (isPair(words[i], words[j])) c++;
            }
        }
        return c;
    }

    public boolean isPair(String a, String b) {
        return (a.charAt(0) == b.charAt(1) && a.charAt(1) == b.charAt(0));
    }
}
