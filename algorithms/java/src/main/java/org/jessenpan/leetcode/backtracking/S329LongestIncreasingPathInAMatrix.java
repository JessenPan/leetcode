package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S329LongestIncreasingPathInAMatrix {

    private int row, col;

    public int longestIncreasingPath(int[][] matrix) {
        //记忆化搜索。
        if (matrix.length == 0) {
            return 0;
        }
        row = matrix.length;
        col = matrix[0].length;

        boolean[][] flag = new boolean[row][col];
        record = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < col; j++) {
                longestPath = Math.max(longestPath, dfs(i, j, Integer.MIN_VALUE, matrix, flag));
            }
        }
        return longestPath;
    }

    private int longestPath = 0;
    private int[][] record;

    private int dfs(int x, int y, int last, int[][] matrix, boolean[][] flag) {
        if (!withinRange(x, y) || flag[x][y] || matrix[x][y] <= last) {
            return -1;
        }
        if (record[x][y] != 0) {
            return record[x][y];
        }

        flag[x][y] = true;
        int longestPath = -1;
        longestPath = Math.max(longestPath, dfs(x + 1, y, matrix[x][y], matrix, flag));
        longestPath = Math.max(longestPath, dfs(x - 1, y, matrix[x][y], matrix, flag));
        longestPath = Math.max(longestPath, dfs(x, y + 1, matrix[x][y], matrix, flag));
        longestPath = Math.max(longestPath, dfs(x, y - 1, matrix[x][y], matrix, flag));
        flag[x][y] = false;

        if (longestPath != -1) {
            return record[x][y] = longestPath + 1;
        }
        return record[x][y] = 1;
    }

    private boolean withinRange(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }
}
