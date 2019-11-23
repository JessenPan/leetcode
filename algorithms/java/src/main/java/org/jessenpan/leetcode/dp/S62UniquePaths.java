package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S62UniquePaths {

    private Integer[][] array;

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        this.array = new Integer[n][m];
        return findPath(n, m);
    }

    private int findPath(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        if (this.array[row - 1][col - 1] != null) {
            return this.array[row - 1][col - 1];
        }

        int val = findPath(row - 1, col) + findPath(row, col - 1);
        this.array[row - 1][col - 1] = val;
        return val;
    }

}
