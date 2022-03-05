// JZ63 买卖股票的最好时机(一)
public class maxProfit {
    public int maxProfit (int[] prices) {
        // write code here
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(-prices[i], dp[i - 1][1]);
        }

        return dp[prices.length - 1][0];
    }
}
