package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S64MinimumPathSumTest {

    private S64MinimumPathSum minimumPathSum = new S64MinimumPathSum();

    @Test
    public void test1() {
        int sum = minimumPathSum.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } });
        Assert.assertEquals(7, sum);
    }

}
