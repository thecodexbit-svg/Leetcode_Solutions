class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int val : prices){
            minPrice = Math.min(minPrice , val);
            int tempProfit = val - minPrice;
            profit = Math.max(profit , tempProfit);
        }
        return profit;
    }
}