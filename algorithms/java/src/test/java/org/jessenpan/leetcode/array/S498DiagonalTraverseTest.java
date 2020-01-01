package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S498DiagonalTraverseTest {

    private S498DiagonalTraverse diagonalTraverse = new S498DiagonalTraverse();

    @Test
    public void test1() {
        int[] orders = diagonalTraverse.findDiagonalOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        Assert.assertArrayEquals(new int[] { 1, 2, 4, 7, 5, 3, 6, 8, 9 }, orders);
    }

}
