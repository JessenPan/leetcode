package org.jessenpan.leetcode.dp;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dp
 */
public class S486PredictTheWinner {

    private Integer[][][] dp;

    private int[] nums;

    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        dp = new Integer[2][len][len];
        int sum = Arrays.stream(nums).sum();
        this.nums = nums;
        calc(0, len - 1);
        return dp[0][0][len - 1] > (sum - dp[0][0][len - 1]);
    }

    private int calc(int left, int right) {
        return 1;
    }
}
