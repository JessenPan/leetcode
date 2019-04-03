package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S566ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length, col = nums[0].length;
        if (r * c != row * col) {
            return nums;
        }
        int[][] matrix = new int[r][c];
        int newi = 0, newj = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (newj >= c) {
                    newi++;
                    newj = 0;
                }
                matrix[newi][newj] = nums[i][j];
                newj++;
            }
        }
        return matrix;
    }
}
