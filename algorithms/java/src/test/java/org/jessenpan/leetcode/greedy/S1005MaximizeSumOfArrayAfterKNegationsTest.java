package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1005MaximizeSumOfArrayAfterKNegationsTest {

    private S1005MaximizeSumOfArrayAfterKNegations maximizeSumOfArrayAfterKNegations = new S1005MaximizeSumOfArrayAfterKNegations();

    @Test
    public void test1() {
        int sum = maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[] { 4, 2, 3 }, 1);
        Assert.assertEquals(5, sum);
    }

    @Test
    public void test2() {
        int sum = maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[] { 3, -1, 0, 2 }, 3);
        Assert.assertEquals(6, sum);
    }

    @Test
    public void test3() {
        int sum = maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[] { 2, -3, -1, 5, -4 }, 2);
        Assert.assertEquals(13, sum);
    }

}
