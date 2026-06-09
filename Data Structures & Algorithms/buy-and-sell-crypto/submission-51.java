class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowest = prices[0];
        

        for(int i = 0; i < prices.length; i++)
        {
            

            if(lowest > prices[i])
            {
                lowest = prices[i];
            }

            int profit = prices[i] - lowest;
            if(maxProfit < profit)
            {
                maxProfit = profit;
            }

            

        }
        return maxProfit;
        
        
    }
}
