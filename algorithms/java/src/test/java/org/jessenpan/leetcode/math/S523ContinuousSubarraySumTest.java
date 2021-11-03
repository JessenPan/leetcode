package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S523ContinuousSubarraySumTest {

    private S523ContinuousSubarraySum continuousSubarraySum = new S523ContinuousSubarraySum();

    @Test
    public void test1() {
        boolean valid = continuousSubarraySum.checkSubarraySum(new int[] { 23, 2, 4, 6, 7 }, 6);
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = continuousSubarraySum.checkSubarraySum(new int[] { 23, 2, 6, 4, 7 }, 6);
        Assert.assertTrue(valid);
    }

    @Test
    public void test3() {
        boolean valid = continuousSubarraySum.checkSubarraySum(new int[] { 23, 2, 6, 4, 7 }, 0);
        Assert.assertFalse(valid);
    }

}
