package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S312BurstBalloons {

    //TODO study
    public int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        for (int i = 0; i < newNums.length; i++) {
            if (i == 0 || i == newNums.length - 1) {
                newNums[i] = 1;
                continue;
            }
            newNums[i] = nums[i - 1];
        }

        nums = newNums;
        int n = newNums.length;
        int[][] dp = new int[n][n];

        // 这里不能按行打表
        // 只能按长度打表, dp[i][j], j-i >= 2
        for (int len = 2; len < n; ++len) {
            for (int i = 0; i < n - len; ++i) {
                int j = i + len;
                for (int k = i + 1; k < j; ++k) {
                    dp[i][j] = Math.max(dp[i][j], nums[i] * nums[k] * nums[j] + dp[i][k] + dp[k][j]);
                }
            }
        }
        return dp[0][n - 1];
    }

}
