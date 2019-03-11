package org.jessenpan.leetcode;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S867TransposeMatrixTest {

    private S844BackspaceStringCompare.S867TransposeMatrix transposeMatrix = new S844BackspaceStringCompare.S867TransposeMatrix();

    @Test
    public void test1() {
        int[][] transposedMatrix = transposeMatrix.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
    }

    @Test
    public void test2() {
        int[][] transposedMatrix = transposeMatrix.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
    }
}
