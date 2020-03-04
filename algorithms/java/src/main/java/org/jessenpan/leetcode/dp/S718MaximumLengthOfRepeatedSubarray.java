package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S718MaximumLengthOfRepeatedSubarray {

    public int findLength(int[] a, int[] b) {

        int aLen = a.length, bLen = b.length, max = 0;
        int[][] dp = new int[aLen + 1][bLen + 1];
        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < bLen; j++) {
                if (a[i] == b[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    max = Math.max(dp[i + 1][j + 1], max);
                }
            }
        }
        return max;
    }

}
