package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S807MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int row = grid.length, col = grid[0].length;
        int[] rowMaxs = new int[row], colMaxs = new int[col];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowMaxs[i] = Math.max(rowMaxs[i], grid[i][j]);
                colMaxs[j] = Math.max(colMaxs[j], grid[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                count += Math.min(rowMaxs[i], colMaxs[j]) - grid[i][j];
            }
        }
        return count;
    }

}
