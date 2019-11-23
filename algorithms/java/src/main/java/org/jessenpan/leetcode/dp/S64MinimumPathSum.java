package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S64MinimumPathSum {

    private int[][] record;

    public int minPathSum(int[][] grid) {

        int r = grid.length - 1, c = grid[0].length - 1;
        record = new int[r + 1][c + 1];
        return sum(grid, r, c);
    }

    private int sum(int[][] grid, int r, int c) {
        if (r == 0 && c == 0) {
            return grid[r][c];
        }

        int v;
        if (record[r][c] != 0) {
            return record[r][c];
        }
        if (r > 0 && c > 0) {
            v = Math.min(sum(grid, r - 1, c), sum(grid, r, c - 1)) + grid[r][c];
        } else if (r > 0) {
            v = sum(grid, r - 1, c) + grid[r][c];
        } else {
            v = sum(grid, r, c - 1) + grid[r][c];
        }
        record[r][c] = v;
        return v;
    }

}
