class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(lowest > prices[i])
            {
                lowest = prices[i];
            }
            int currentProfit = prices[i] - lowest;
            if( currentProfit > maxProfit)
            {
                maxProfit = currentProfit;
            }
        
        }
        return maxProfit;
       

        
        
    }
}
