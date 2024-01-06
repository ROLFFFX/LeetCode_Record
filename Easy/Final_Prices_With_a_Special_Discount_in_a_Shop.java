package Easy;

public class Final_Prices_With_a_Special_Discount_in_a_Shop {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++){
            int curr = prices[i];
            int j = i + 1;
            for (; j < prices.length; j++){
                if (prices[j] <= curr){
                    curr = prices[j];
                    break;
                }
            }
            if (j == prices.length){
                ans[i] = curr;
            } else {
                ans[i] = prices[i] - curr;
            }
        }
        return ans;
    }
}
