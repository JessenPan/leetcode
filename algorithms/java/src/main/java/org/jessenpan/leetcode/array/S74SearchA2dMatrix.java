package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S74SearchA2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1;

        if (row == 1 && col == 1) {
            return matrix[0][0] == target;
        }

        while (left <= right) {

            int middle = right + (left - right) / 2;
            int r = middle / col;
            int c = middle % col;
            if (matrix[r][c] == target) {
                return true;
            }

            if (matrix[r][c] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return false;
    }

}
