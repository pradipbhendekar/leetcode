class Solution {

    public int maxProfit(int[] prices){
   int max_profit=0;
        int buy_price=prices[0];
        for(int i=0;i<prices.length;i++){
            int current_profit = prices[i] - buy_price;
            if(buy_price>prices[i]){
               buy_price=prices[i];
            }
            if(current_profit>max_profit){
                max_profit=current_profit;
            }
        }
        return max_profit;
    }
}