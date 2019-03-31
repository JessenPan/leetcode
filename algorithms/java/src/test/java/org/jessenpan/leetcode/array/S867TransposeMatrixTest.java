package org.jessenpan.leetcode.array;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S867TransposeMatrixTest {

    private S867TransposeMatrix transposeMatrix = new S867TransposeMatrix();

    @Test
    public void test1() {
        int[][] transposedMatrix = transposeMatrix.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
    }

    @Test
    public void test2() {
        int[][] transposedMatrix = transposeMatrix.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
    }
}
