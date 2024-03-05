package Medium;

public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;
        char prev = 'd';
        char[] arr = s.toCharArray();
        int ans = 0;
        while (start < end){
            if (arr[start] != arr[end]) {
                if (arr[start] == prev){
                    start++;
                    ans++;
                    continue;
                } else if (arr[end] == prev){
                    end--;
                    ans++;
                    continue;
                }
                break;
            } else {
                prev = arr[start];
                start++;
                end--;
                ans+=2;
            }
        }
        if (arr[start] == prev) ans++;
        return (s.length() - ans) < 0 ? 0 : s.length() - ans;
    }
}
