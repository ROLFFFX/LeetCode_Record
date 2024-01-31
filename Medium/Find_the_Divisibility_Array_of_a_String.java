package Medium;

public class Find_the_Divisibility_Array_of_a_String {
    public int[] divisibilityArray(String word, int m) {
        long x = 0;
        int n = word.length();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            x = x * 10 + (word.charAt(i) - '0');
            ans[i] = (x % m == 0 ? 1 : 0);
            x %= m;
        }
        return ans;
    }
}
