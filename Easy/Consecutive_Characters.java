package Easy;

public class Consecutive_Characters {
    public int maxPower(String s) {
        int max = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            int c = 1;
            while (i < arr.length - 1 && arr[i+1] == arr[i]) {
                c++;
                i++;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}
