package org.jessenpan.leetcode.dp;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S931MinimumFallingPathSum {

    public int minFallingPathSum(int[][] a) {

        if (a == null || a.length == 0 || a[0].length == 0) {
            return 0;
        }
        int row = a.length;
        int col = a[0].length;
        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                int min = a[i + 1][j];
                if (j - 1 >= 0) {
                    min = Math.min(min, a[i + 1][j - 1]);
                }
                if (j + 1 < col) {
                    min = Math.min(min, a[i + 1][j + 1]);
                }
                a[i][j] += min;
            }
        }
        return Arrays.stream(a[0]).min().getAsInt();
    }

}
