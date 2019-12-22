package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S304RangeSumQuery2dImmutable {

    public static class NumMatrix {

        private int[][] matrix;
        private Integer[][] sums;

        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0) {
                return;
            }
            this.matrix = matrix;
            this.sums = new Integer[matrix.length][matrix[0].length];
            int row = matrix.length, col = matrix[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == 0 && j == 0) {
                        sums[i][j] = matrix[i][j];
                        continue;
                    }
                    int sum = 0;
                    sum += matrix[i][j];
                    if (i - 1 >= 0) {
                        sum += sums[i - 1][j];
                    }
                    if (j - 1 >= 0) {
                        sum += sums[i][j - 1];
                    }
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        sum -= sums[i - 1][j - 1];
                    }
                    sums[i][j] = sum;
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (sums == null) {
                return 0;
            }
            int sum = sums[row2][col2];
            if (row1 - 1 >= 0) {
                sum -= sums[row1 - 1][col2];
            }
            if (col1 - 1 >= 0) {
                sum -= sums[row2][col1 - 1];
            }
            if (row1 - 1 >= 0 && col1 - 1 >= 0) {
                sum += sums[row1 - 1][col1 - 1];
            }
            return sum;
        }
    }

}
