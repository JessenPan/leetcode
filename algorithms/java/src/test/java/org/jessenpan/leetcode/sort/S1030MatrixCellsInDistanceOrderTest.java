package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1030MatrixCellsInDistanceOrderTest {

    private S1030MatrixCellsInDistanceOrder matrixCellsInDistanceOrder = new S1030MatrixCellsInDistanceOrder();

    @Test
    public void test1() {
        int[][] array = matrixCellsInDistanceOrder.allCellsDistOrder(1, 2, 0, 0);
        Assert.assertArrayEquals(new int[][] { { 0, 0 }, { 0, 1 } }, array);
    }

    @Test
    public void test2() {
        int[][] array = matrixCellsInDistanceOrder.allCellsDistOrder(2, 2, 0, 1);
        Assert.assertArrayEquals(new int[][] { { 0, 1 }, { 0, 0 }, { 1, 1 }, { 1, 0 } }, array);
    }

    @Test
    public void test3() {
        int[][] array = matrixCellsInDistanceOrder.allCellsDistOrder(2, 3, 1, 2);
        Assert.assertArrayEquals(new int[][] { { 1, 2 }, { 0, 2 }, { 1, 1 }, { 0, 1 }, { 1, 0 }, { 0, 0 } }, array);
    }

}
