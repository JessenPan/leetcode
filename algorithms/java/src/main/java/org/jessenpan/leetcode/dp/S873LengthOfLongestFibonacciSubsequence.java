package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S873LengthOfLongestFibonacciSubsequence {

    public int lenLongestFibSubseq(int[] a) {

        if (a.length <= 2) {
            return 0;
        }
        int max = 0, len = a.length;
        int[][] dp = new int[len][len];
        for (int right = 2; right < len; right++) {
            for (int left = 0; left + 2 <= right; left++) {
                if (right - left == 2) {
                    dp[left][right] = (a[left] + a[left + 1] == a[right]) ? 1 : 0;
                } else {
                    boolean isFib = a[right - 2] + a[right - 1] == a[right];
                    if (isFib) {
                        dp[left][right] = dp[left][right - 1] + 1;
                    } else {
                        dp[left][right] = 0;
                    }
                }
                max = Math.max(max, dp[left][right]);
            }
        }
        return max;
    }

}
