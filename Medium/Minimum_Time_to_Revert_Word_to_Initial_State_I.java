package Medium;

public class Minimum_Time_to_Revert_Word_to_Initial_State_I {
    public int minimumTimeToInitialState(String word, int k) {
        char[] arr = word.toCharArray();
        char prefix = arr[0];
        for (int i = k, count = 1; i < word.length(); i+=k, count++){
            if (prefix == arr[i]){
                int remain_len = word.length() - i;
                if (check(arr, remain_len, 0, i)) return count;
            }
        }
        if (word.length() % k == 0){
            return word.length() / k;
        }
        return word.length() / k + 1;
    }

    public boolean check(char[] arr, int limit, int i, int j){
        for (; i < limit; i++, j++){
            if (arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
}
