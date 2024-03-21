package Medium;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int prof = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i - 1] < prices[i]){
                prof += prices[i] - prices[i - 1];
            }
        }
        return prof;
    }
}
