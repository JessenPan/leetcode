package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S240SearchA2dMatrixIITest {

    private S240SearchA2dMatrixII searchA2dMatrixII = new S240SearchA2dMatrixII();

    @Test
    public void test1() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 5);
        Assert.assertTrue(found);
    }

    @Test
    public void test2() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 20);
        Assert.assertFalse(found);
    }

    @Test
    public void test3() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { {} }, 20);
        Assert.assertFalse(found);
    }

    @Test
    public void test4() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { { 1, 1 } }, 0);
        Assert.assertFalse(found);
    }

    @Test
    public void test5() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { { 4, 4, 4 }, { 9, 9, 9 }, { 9, 14, 15 }, { 9, 18, 23 }, { 11, 22, 26 } }, 27);
        Assert.assertFalse(found);
    }

    @Test
    public void test6() {
        boolean found = searchA2dMatrixII.searchMatrix(new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } }, 5);
        Assert.assertTrue(found);
    }

}
