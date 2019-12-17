package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S512CoinChange2 {

    //TODO 回溯算法/回溯算法+剪枝/动态规划
    public int change(int amount, int[] coins) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        return dp[amount];
    }
}
