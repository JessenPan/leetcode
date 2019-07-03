package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S73SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        int row = matrix.length, col = matrix[0].length;
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    points.add(new int[] { i, j });
                }
            }
        }

        for (int[] point : points) {
            int x = point[0], y = point[1];
            for (int i = 0; i < row; i++) {
                matrix[i][y] = 0;
            }
            for (int i = 0; i < col; i++) {
                matrix[x][i] = 0;
            }
        }
    }

}
