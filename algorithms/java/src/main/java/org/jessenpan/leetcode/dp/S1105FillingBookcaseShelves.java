package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S1105FillingBookcaseShelves {

    public int minHeightShelves(int[][] books, int shelfWidth) {

        int[] dp = new int[books.length];

        int len = books.length, min, sumedWidth, maxHeight;
        for (int i = 0; i < len; i++) {

            if (i == 0) {
                dp[i] = books[i][1];
                continue;
            }
            min = Integer.MAX_VALUE;
            maxHeight = Integer.MIN_VALUE;
            sumedWidth = 0;
            for (int j = i; j >= 0; j--) {
                sumedWidth += books[j][0];
                maxHeight = Math.max(maxHeight, books[j][1]);
                if (sumedWidth > shelfWidth) {
                    break;
                }
                min = Math.min(min, (j - 1 < 0 ? 0 : dp[j - 1]) + maxHeight);
            }
            dp[i] = min;
        }

        return dp[len - 1];
    }

}

//  f(n)=min(f(n-x)+Hx)
