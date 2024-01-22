package Easy;

public class DI_String_Match {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int ai = 0;
        int de = s.length();
        for (int i = 0; i < s.length(); i++){
            ans[i] = (s.charAt(i) == 'I' ? ai++ : de--);
        }
        ans[s.length()] = ai;
        return ans;
    }
}
