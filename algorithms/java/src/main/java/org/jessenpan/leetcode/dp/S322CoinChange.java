package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S322CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        Integer[] dp = new Integer[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin < 0 || (dp[i - coin] != null && dp[i - coin] == Integer.MAX_VALUE)) {
                    continue;
                }
                dp[i - coin] = (dp[i - coin] == null ? 0 : dp[i - coin]);
                if (min == Integer.MAX_VALUE) {
                    min = dp[i - coin] + 1;
                } else {
                    min = Math.min(min, dp[i - coin] + 1);
                }
            }
            dp[i] = min;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

}
