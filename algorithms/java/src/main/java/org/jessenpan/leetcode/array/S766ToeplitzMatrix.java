package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S766ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int len = row + col - 1;
        int pos[] = new int[2];
        for (int i = 0; i < len; i++) {
            if (i < row) {
                pos[0] = row - i - 1;
                pos[1] = 0;
            } else {
                pos[0] = 0;
                pos[1] = i - row + 1;
            }
            while ((pos[0]+1) < row && (pos[1]+1) < col) {
                if (matrix[pos[0] + 1][pos[1] + 1] != matrix[pos[0]][pos[1]]) {
                    return false;
                }
                ++pos[0];
                ++pos[1];
            }
        }

        return true;
    }
}
