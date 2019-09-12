package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S746MinCostClimbingStairsTest {

    private S746MinCostClimbingStairs minCostClimbingStairs = new S746MinCostClimbingStairs();

    @Test
    public void test1() {
        int c = minCostClimbingStairs.minCostClimbingStairs(new int[] { 10, 15, 20 });
        Assert.assertEquals(15, c);
    }

    @Test
    public void test2() {
        int c = minCostClimbingStairs.minCostClimbingStairs(new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 });
        Assert.assertEquals(6, c);
    }

}
