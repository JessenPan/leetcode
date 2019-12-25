package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1155NumberOfDiceRollsWithTargetSumTest {

    private S1155NumberOfDiceRollsWithTargetSum numberOfDiceRollsWithTargetSum = new S1155NumberOfDiceRollsWithTargetSum();

    @Test
    public void test1() {
        int times = numberOfDiceRollsWithTargetSum.numRollsToTarget(1, 6, 3);
        Assert.assertEquals(1, times);
    }

    @Test
    public void test2() {
        int times = numberOfDiceRollsWithTargetSum.numRollsToTarget(2, 6, 7);
        Assert.assertEquals(6, times);
    }

    @Test
    public void test3() {
        int times = numberOfDiceRollsWithTargetSum.numRollsToTarget(2, 5, 10);
        Assert.assertEquals(1, times);
    }

    @Test
    public void test4() {
        int times = numberOfDiceRollsWithTargetSum.numRollsToTarget(1, 2, 3);
        Assert.assertEquals(0, times);
    }

    @Test
    public void test5() {
        int times = numberOfDiceRollsWithTargetSum.numRollsToTarget(30, 30, 500);
        Assert.assertEquals(222616187, times);
    }

}
