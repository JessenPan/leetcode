package org.jessenpan.leetcode.dynamicprogramming;

/**
 * @author jessenpan
 */
public class S62UniquePaths {

    private int row, col;

    private int pathCount = 0;

    public int uniquePaths(int m, int n) {
        this.col = m - 1;
        this.row = n - 1;
        findPath(0, 0);
        return pathCount;
    }

    private void findPath(int x, int y) {
        if (x == row && y == col) {
            pathCount++;
            return;
        }

        if (x > row || y > col) {
            return;
        }

        findPath(x + 1, y);
        findPath(x, y + 1);
    }

}
