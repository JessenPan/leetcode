package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S63UniquePathsII {

    private int[][] grid;

    private Integer[][] paths;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        this.grid = obstacleGrid;
        this.paths = new Integer[obstacleGrid.length][obstacleGrid[0].length];

        return calPath(obstacleGrid.length - 1, obstacleGrid[0].length - 1);
    }

    private int calPath(int row, int col) {

        if (paths[row][col] != null) {
            return paths[row][col];
        }
        if (grid[row][col] == 1) {
            paths[row][col] = 0;
            return 0;
        }

        if (row == 0 || col == 0) {
            if (row == 0 && col == 0) {
                return 1;
            }
            if (paths[row][col] != null) {
                return paths[row][col];
            }
            int path = 0;
            if (!hasBarrierOnLine(row, col)) {
                path = 1;
            }
            paths[row][col] = path;
            return path;
        }

        int path;

        path = calPath(row - 1, col) + calPath(row, col-1);
        paths[row][col] = path;
        return path;
    }

    private boolean hasBarrierOnLine(int row, int col) {
        if (row == 0) {
            for (int i = 0; i <= col; i++) {
                if (grid[0][i] == 1) {
                    return true;
                }
            }
        }
        if (col == 0) {
            for (int i = 0; i < row; i++) {
                if (grid[i][col] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
