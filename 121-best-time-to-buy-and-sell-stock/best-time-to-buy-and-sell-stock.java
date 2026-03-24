class Solution {
    public int maxProfit(int[] prices) {
        int cost=-1;
        int profit=0;
        int current=prices[0];
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-current;
            profit=Math.max(profit,cost);
            current=Math.min(current,prices[i]);
        }
        return profit;

    }
}