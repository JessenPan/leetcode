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
        
    }
}
