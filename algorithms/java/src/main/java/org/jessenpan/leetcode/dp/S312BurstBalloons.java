package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S312BurstBalloons {

    private Integer[][] dp;

    private int[] nums;

    public int maxCoins(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        this.nums = nums;
        dp = new Integer[n][n];
        return calc(0, n - 1);
    }

    private int calc(int left, int right) {
        if (dp[left][right] != null) {
            return dp[left][right];
        }
        int max = Integer.MIN_VALUE;

        for (int i = left; i <= right; i++) {
            
        }
        dp[left][right] = max;
        return max;
    }

}
