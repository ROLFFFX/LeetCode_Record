package Easy;

public class Count_Prefixes_of_a_Given_String {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for (String pre : words){
            if (pre.length() > s.length()) continue;
            if (pre.equals(s.substring(0, pre.length()))){
                c++;
            }
        }
        return c;
    }

    public int countPrefixes_optimized(String[] words, String s) {
        int c = 0;
        for (String pre : words){
            if (s.startsWith(pre)) c++;
        }
        return c;
    }
}
