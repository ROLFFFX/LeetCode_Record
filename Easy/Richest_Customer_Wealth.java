package Easy;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc : accounts){
            int w = 0;
            for (int m : acc) w+=m;
            max = Math.max(w, max);
        }
        return max;
    }
}
