package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S931MinimumFallingPathSumTest {

    private S931MinimumFallingPathSum minimumFallingPathSum = new S931MinimumFallingPathSum();

    @Test
    public void test1() {
        int minPath = minimumFallingPathSum.minFallingPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        Assert.assertEquals(12, minPath);
    }

}
