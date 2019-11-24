package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S1043PartitionArrayForMaximumSum {

    public int maxSumAfterPartitioning(int[] a, int k) {

        int len = a.length, max, sum, maxElement;
        int[] dp = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {

            if (i == 1) {
                dp[1] = a[0];
                continue;
            }
            max = Integer.MIN_VALUE;
            maxElement = Integer.MIN_VALUE;
            sum = 0;
            for (int j = i; i - j < k && j >= 1; j--) {
                sum += a[j-1];
                maxElement = Math.max(maxElement, a[j-1]);
                max = Math.max(max, dp[j - 1] + (i - j + 1) * maxElement);
            }
            dp[i] = max;
        }

        return dp[len];
    }

}
