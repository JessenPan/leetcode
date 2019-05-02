package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S598RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }

        int len = ops.length;
        int minRow = -1, minCol = -1;
        for (int i = 0; i < len; i++) {
            minCol = minCol == -1 ? ops[i][0] : Math.min(minCol, ops[i][0]);
            minRow = minRow == -1 ? ops[i][1] : Math.min(minRow, ops[i][1]);
        }

        return minRow * minCol;
    }

}
