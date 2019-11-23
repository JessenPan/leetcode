package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 */
public class S123BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max_k = 2;
        int len = prices.length;
        int[][][] dp = new int[len][max_k + 1][2];
        for (int i = 0; i < len; i++) {
            for (int k = max_k; k >= 1; k--) {
                if (i == 0) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        // 穷举了 n × max_k × 2 个状态，正确。
        return dp[len - 1][max_k][0];
    }

}
