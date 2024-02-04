package Hard;

public class Minimum_Time_to_Revert_Word_to_Initial_State_II {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length(), count = 0, i = -1;
        for (i = k; i < n; i = i + k) {
            if (word.startsWith(word.substring(i))) {
                count++;
                break;
            }
            count++;
        }
        return i < n ? count : count + 1;
    }
}
