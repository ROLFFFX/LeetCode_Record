package Easy;

public class Best_Time_To_Buy_and_Sell_Stocks {
//    You are given an array prices where prices[i] is
//    the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single
//    day to buy one stock and choosing a different day in the
//    future to sell that stock.
//
//    Return the maximum profit you can achieve from this transaction.
//    If you cannot achieve any profit, return 0.
    public static void main(String[] args) {
        // return max profit only. if not, return 0.
        int[] prices = {5,4,3,2,1};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int min_price = prices[0];  // first day price
        int maxprof = 0;
        for(int i=1;i<prices.length;i++){   // loop through array
            // prices[i] is the selling price
            maxprof = Math.max(maxprof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }
        return maxprof;
//        return prices[0];   //dummy
    }


        /** First Attempt: Time out for large entry. **/
//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        int highest_val = 0;
//        for (int i = prices.length - 1; i >= 0 ; i--) {
//            // for each day
//            int curr_max = 0;
//            int curr_price = prices[i];
//            // skip unnecessary entries
//            if (max > curr_price){
//                continue;
//            }
//            if (curr_price > highest_val){
//                highest_val = curr_price;
//            } else {
//                continue;
//            }
//            for (int j = i - 1; j >= 0; j--){
//                int m = curr_price - prices[j];
//                if (m > curr_max){ curr_max = m;}
//            }
//            if (curr_max > max){
//                max = curr_max;
//            }
//        }
//        return max;
//    }
}
