package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S494TargetSumTest {

    private S494TargetSum targetSum = new S494TargetSum();

    @Test
    public void test1() {
        int t = targetSum.findTargetSumWays(new int[] { 1, 1, 1, 1, 1 }, 3);
        Assert.assertEquals(t, 5);
    }

}
