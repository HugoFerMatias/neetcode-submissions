/*
Mapeamento pos + 1 = dia 

*/

class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int len = prices.length;
        if(len == 1) {
            return profit;
        }

        for(int i = 0; i < len - 1; i++) {
            if(prices[i] < prices[i + 1]) {
                profit = profit + prices[i + 1] - prices[i];
            } 
        }

        return profit;
        
        
    }
}