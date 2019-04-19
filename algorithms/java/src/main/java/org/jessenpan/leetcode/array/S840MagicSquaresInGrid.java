package org.jessenpan.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:array
 */
public class S840MagicSquaresInGrid {

    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int num = 0;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                if (isMagicSquare(i, j, grid)) {
                    num++;
                }
            }
        }
        return num;
    }

    private boolean isMagicSquare(int i, int j, int[][] grid) {
        Set<Integer> magicSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                magicSet.remove(grid[k][l]);
            }
        }
        if (!magicSet.isEmpty()) {
            return false;
        }
        int lastSum = -1, sum = -1;
        for (int k = i; k < i + 3; k++) {
            sum = grid[k][j] + grid[k][j + 1] + grid[k][j + 2];
            if (lastSum == -1) {
                lastSum = sum;
            } else if (sum != lastSum) {
                return false;
            }
        }
        for (int k = j; k < j + 3; k++) {
            sum = grid[i][k] + grid[i + 1][k] + grid[i + 2][k];
            if (sum != lastSum) {
                return false;
            }
        }
        return grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] == lastSum && grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] == lastSum;
    }

}
