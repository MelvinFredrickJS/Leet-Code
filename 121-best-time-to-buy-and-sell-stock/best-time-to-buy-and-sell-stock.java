class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}