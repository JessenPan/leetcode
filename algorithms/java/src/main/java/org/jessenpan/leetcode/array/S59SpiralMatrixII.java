package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S59SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int len = n * n;

        int x = 0, y = 0, i = 0;
        while (i < len) {
            while (true) {

                if (y < n && matrix[x][y] == 0) {
                    matrix[x][y] = i + 1;
                    y++;
                    i++;
                } else {
                    y--;
                    x++;
                    break;
                }
            }

            while (true) {
                if (x < n && matrix[x][y] == 0) {
                    matrix[x][y] = i + 1;
                    i++;
                    x++;
                } else {
                    y--;
                    x--;
                    break;
                }
            }

            while (true) {

                if (y >= 0 && matrix[x][y] == 0) {
                    matrix[x][y] = i + 1;
                    i++;
                    y--;
                } else {
                    y++;
                    x--;
                    break;
                }
            }

            while (true) {
                if (x >= 0 && matrix[x][y] == 0) {
                    matrix[x][y] = i + 1;
                    x--;
                    i++;
                } else {
                    x++;
                    y++;
                    break;
                }
            }
        }
        return matrix;
    }

}
