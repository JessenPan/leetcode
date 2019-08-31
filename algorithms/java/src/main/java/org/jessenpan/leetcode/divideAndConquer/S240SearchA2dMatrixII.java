package org.jessenpan.leetcode.divideAndConquer;

/**
 * @author jessenpan
 * tag:divideAndConquer
 */
public class S240SearchA2dMatrixII {

    //TODO 
    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;

        if (matrix == null || matrix.length == 0) {
            return false;
        }

        return search(0, 0, matrix[0].length - 1, matrix.length - 1);
    }

    private int[][] matrix;
    private int target;

    private boolean search(int left, int up, int right, int down) {
        // this submatrix has no height or no width.
        if (left > right || up > down) {
            return false;
        } else if (target < matrix[up][left] || target > matrix[down][right]) {
            return false;
        }

        int mid = left + (right - left) / 2;

        int row = up;
        while (row <= down && matrix[row][mid] <= target) {
            if (matrix[row][mid] == target) {
                return true;
            }
            row++;
        }

        return search(left, row, mid - 1, down) || search(mid + 1, up, right, row - 1);
    }

}
