package org.jessenpan.leetcode.dynamicProgramming;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S813LargestSumOfAverages {

    public double largestSumOfAverages(int[] a, int k) {
        if (k == 1) {
            return Arrays.stream(a).average().getAsDouble();
        }
        int len = a.length;
        double[][] dp = new double[len + 1][k + 1];

        //0 表示 1个元素
        double sum = 0;
        double max;
        for (int i = 1; i < len + 1; i++) {
            sum += a[i - 1];
            for (int j = 1; j < k + 1; j++) {

                if (j > i) {
                    break;
                }

                if (j == 1) {
                    dp[i][j] = sum / i;
                    continue;
                }
                double subSum = 0;
                max = Double.MIN_VALUE;
                for (int m = i; m >= 1; m--) {
                    subSum += a[m - 1];
                    if (m - 1 < j - 1) {
                        break;
                    }
                    max = Math.max(max, dp[m - 1][j - 1] + subSum / (i - m + 1));
                }
                dp[i][j] = max;
            }
        }

        return dp[len][k];
    }

}
