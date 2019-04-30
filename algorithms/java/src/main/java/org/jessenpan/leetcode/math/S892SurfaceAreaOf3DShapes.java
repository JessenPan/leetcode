package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S892SurfaceAreaOf3DShapes {

    public int surfaceArea(int[][] grid) {
        int area = 0;
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {
                    area += 6 * grid[i][j] - 2 * (grid[i][j] - 1);

                    //front
                    if (i > 0 && grid[i - 1][j] != 0) {
                        area -= Math.min(grid[i][j], grid[i - 1][j]);
                    }

                    //back
                    if (i < row - 1 && grid[i + 1][j] != 0) {
                        area -= Math.min(grid[i][j], grid[i + 1][j]);
                    }

                    //left
                    if (j > 0 && grid[i][j - 1] != 0) {
                        area -= Math.min(grid[i][j], grid[i][j - 1]);
                    }

                    //right
                    if (j < col - 1 && grid[i][j + 1] != 0) {
                        area -= Math.min(grid[i][j], grid[i][j + 1]);
                    }
                }
            }
        }
        return area;
    }
}
