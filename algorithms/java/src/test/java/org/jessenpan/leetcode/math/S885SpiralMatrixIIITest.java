package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S885SpiralMatrixIIITest {

    private S885SpiralMatrixIII spiralMatrixIII = new S885SpiralMatrixIII();

    @Test
    public void test1() {
        int[][] t = spiralMatrixIII.spiralMatrixIII(1, 4, 0, 0);
        Assert.assertArrayEquals(new int[][] { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } }, t);
    }

}
