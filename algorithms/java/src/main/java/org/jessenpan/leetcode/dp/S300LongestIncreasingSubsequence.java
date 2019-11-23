package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S300LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        if (nums.length == 2) {
            return nums[1] > nums[0] ? 2 : 1;
        }

        int len = nums.length + 1;
        int[][] dp = new int[len][2]; //第一记录长度，第二个记录最大值
        dp[1][0] = 1;
        dp[1][1] = nums[0];
        if (nums[1] > nums[0]) {
            dp[2][0] = 2;
            dp[2][1] = nums[1];
        } else {
            dp[2][0] = 1;
            dp[2][1] = nums[1];
        }
        int maxLen;
        int maxVal = 0;
        for (int i = 3; i < len; i++) {
            maxLen = Integer.MIN_VALUE;
            for (int j = i - 1; j >= 1; j--) {
                if (nums[i - 1] > dp[j][1]) {
                    maxLen = dp[j][0] + 1;
                    maxVal = dp[j][1];
                    break;
                }
            }
            if (dp[i - 1][0] > maxLen) {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][1];
            } else {
                dp[i][0] = maxLen;
                dp[i][1] = maxVal;
            }
        }
        return dp[len - 1][0];
    }

}
