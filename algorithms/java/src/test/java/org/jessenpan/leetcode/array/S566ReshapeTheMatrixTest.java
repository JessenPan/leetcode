package org.jessenpan.leetcode.array;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S566ReshapeTheMatrixTest {

    private S566ReshapeTheMatrix reshapeTheMatrix = new S566ReshapeTheMatrix();
    
    @Test
    public void test1(){
        int[][] matrix = reshapeTheMatrix.matrixReshape(new int[][] { { 1, 2 }, { 3, 4 } }, 1, 4);
    }

    @Test
    public void test2(){
        int[][] matrix = reshapeTheMatrix.matrixReshape(new int[][] { { 1, 2 }, { 3, 4 } }, 2, 4);
    }
    
}
