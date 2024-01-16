package Easy;

public class Maximum_Repeating_Substring {
    public int maxRepeating(String sequence, String word) {
        if (sequence.length() == 1 && word.length() == 1){
            if (word.equals(sequence)) return 1;
            return 0;
        }
        int max = 0;
        for (int i = 0; i < sequence.length(); i++){
            if (sequence.charAt(i) == word.charAt(0)){
                int count = 0;
                int j = i;
                for (; j + word.length() <= sequence.length();
                     j += word.length()){
                    if (sequence.substring(j, j+word.length())
                            .equals(word)) {
                        count++;
                    } else {
                        break;
                    }
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
