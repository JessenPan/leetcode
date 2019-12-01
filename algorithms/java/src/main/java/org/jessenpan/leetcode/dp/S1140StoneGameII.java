package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S1140StoneGameII {

    private Integer[][] dp;

    private int[] piles;

    public int stoneGameII(int[] piles) {
        int len = piles.length;
        dp = new Integer[len][len];
        this.piles = piles;
        calc(0, len - 1, 1);
        return dp[0][len - 1];
    }

    private int calc(int left, int right, int m) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] != null) {
            return dp[left][right];
        }

        int max = 0;
        int sum = 0;
        int nextM;
        for (int i = 1; i <= 2 * m; i++) {
            for (int j = left; j < left + i && j <= right; j++) {
                sum += piles[j];
            }
            nextM = Math.max(i, m);
            max = Math.max(max, sum);
            for (int j = 1; j < 2 * nextM && left + i + j <= right; j++) {
                max = Math.max(max, sum + calc(left + i + j, right, Math.max(j, nextM)));
            }
        }
        dp[left][right] = max;
        return max;
    }

}
