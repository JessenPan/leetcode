package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1031MaximumSumOfTwoNonOverLappingSubarraysTest {

    private S1031MaximumSumOfTwoNonOverLappingSubarrays maximumSumOfTwoNonOverLappingSubarrays = new S1031MaximumSumOfTwoNonOverLappingSubarrays();

    @Test
    public void test1() {
        int max = maximumSumOfTwoNonOverLappingSubarrays.maxSumTwoNoOverlap(new int[] { 0, 6, 5, 2, 2, 5, 1, 9, 4 }, 1, 2);
        Assert.assertEquals(20, max);
    }

    @Test
    public void test2() {
        int max = maximumSumOfTwoNonOverLappingSubarrays.maxSumTwoNoOverlap(new int[] { 3, 8, 1, 3, 2, 1, 8, 9, 0 }, 3, 2);
        Assert.assertEquals(29, max);
    }

    @Test
    public void test3() {
        int max = maximumSumOfTwoNonOverLappingSubarrays.maxSumTwoNoOverlap(new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8 }, 4, 3);
        Assert.assertEquals(31, max);
    }

}
