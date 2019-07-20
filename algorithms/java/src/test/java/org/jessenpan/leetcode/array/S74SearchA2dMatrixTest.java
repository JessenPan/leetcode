package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S74SearchA2dMatrixTest {

    private S74SearchA2dMatrix searchA2dMatrix = new S74SearchA2dMatrix();

    @Test
    public void test1() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 3);
        Assert.assertTrue(isFound);
    }

    @Test
    public void test2() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 13);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test3() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1 } }, 3);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test4() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1, 1 } }, 3);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test5() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1 }, { 1 } }, 3);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test6() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 35);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test7() {
        boolean isFound = searchA2dMatrix.searchMatrix(new int[][] { { 1, 3 } }, 1);
        Assert.assertTrue(isFound);
    }
}
