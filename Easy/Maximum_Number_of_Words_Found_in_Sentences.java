package Easy;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences){
            String[] arr = s.split(" ");
            max = Math.max(max, arr.length);
        }
        return max;
    }
}
