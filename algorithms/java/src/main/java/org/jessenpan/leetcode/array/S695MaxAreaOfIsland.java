package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S695MaxAreaOfIsland {

    private int r, c;
    private int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        this.r = grid.length;
        this.c = grid[0].length;
        if (this.c == 0) {
            return 0;
        }

        this.grid = grid;
        int max = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                max = Math.max(max, calc(i, j, new int[r][c]));
            }
        }
        return max;
    }

    private int calc(int x, int y, int[][] memo) {
        if (memo[x][y] == 1) {
            return 0;
        }
        memo[x][y] = 1;
        if (grid[x][y] == 0) {
            return 0;
        }

        int area = 1;
        if (x + 1 < r) {
            area += calc(x + 1, y, memo);
        }
        if (x - 1 >= 0) {
            area += calc(x - 1, y, memo);
        }
        if (y + 1 < c) {
            area += calc(x, y + 1, memo);
        }
        if (y - 1 >= 0) {
            area += calc(x, y - 1, memo);
        }

        return area;
    }

}
