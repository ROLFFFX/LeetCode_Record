package Easy;

public class Shortest_Distance_to_a_Character {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (arr[i] == c) {
                ans[i] = 0;
                continue;
            }
            int j = i - 1;
            int k = i + 1;
            int dist_left = Integer.MAX_VALUE;
            while (j >= 0){
                if (arr[j] == c){
                    dist_left = Math.abs(i - j);
                    break;
                }
                j--;
            }
            int dist_right = Integer.MAX_VALUE;
            while (k < s.length()){
                if (arr[k] == c){
                    dist_right = Math.abs(i - k);
                    break;
                }
                k++;
            }
            ans[i] = Math.min(dist_right, dist_left);
        }
        return ans;
    }
}
