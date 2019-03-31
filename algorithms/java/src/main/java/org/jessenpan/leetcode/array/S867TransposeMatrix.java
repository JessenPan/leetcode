package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S867TransposeMatrix {

    public int[][] transpose(int[][] A) {
        int lengthOfFirstLevel = A.length, lengthOfSecondLevel = A[0].length;
        int[][] transposedArray = new int[lengthOfSecondLevel][lengthOfFirstLevel];

        for (int i = 0; i < lengthOfSecondLevel; i++) {
            for (int j = 0; j < lengthOfFirstLevel; j++) {
                transposedArray[i][j] = A[j][i];
            }
        }
        return transposedArray;
    }
}
