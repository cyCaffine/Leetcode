class Solution {
    public int maxProfit(int[] prices) {

      if(prices == null || prices.length == 0){
        return 0;
      }

      int buy = prices[0], max_profit = 0;
      int n = prices.length;

      for(int i = 0; i < n; i++){
         // Checking for lower buy value
         if(buy > prices[i]){
            buy = prices[i];
         }
          // Checking for higher profit
          if(prices[i] - buy > max_profit){
            max_profit = prices[i] - buy;
          }
}
return max_profit;

    }
}