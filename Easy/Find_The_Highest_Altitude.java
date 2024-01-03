package Easy;

public class Find_The_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int max = 0;
        for (int g : gain){
            max = Math.max(max, ans+=g);
        }
        return max;
    }
}
