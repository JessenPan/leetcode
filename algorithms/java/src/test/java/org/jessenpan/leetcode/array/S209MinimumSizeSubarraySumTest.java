package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S209MinimumSizeSubarraySumTest {

    private S209MinimumSizeSubarraySum minimumSizeSubarraySum = new S209MinimumSizeSubarraySum();

    @Test
    public void test1() {
        int min = minimumSizeSubarraySum.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 });
        Assert.assertEquals(2, min);
    }

}
