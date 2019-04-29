package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S883ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {

        int xFace = 0;
        int[] yFace = new int[grid.length], zFace = new int[grid[0].length];
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {
                    xFace++;
                }
                if (grid[i][j] > yFace[j]) {
                    yFace[j] = grid[i][j];
                }
                if (grid[i][j] > zFace[i]) {
                    zFace[i] = grid[i][j];
                }
            }
        }

        return xFace + Arrays.stream(yFace).sum() + Arrays.stream(zFace).sum();
    }

}
