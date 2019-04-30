package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S766ToeplitzMatrixTest {

    private S766ToeplitzMatrix toeplitzMatrix = new S766ToeplitzMatrix();
    
    @Test
    public void test1(){
        boolean isToeplitz = toeplitzMatrix.isToeplitzMatrix(new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } });
        assertTrue(isToeplitz);
    }
    
}
