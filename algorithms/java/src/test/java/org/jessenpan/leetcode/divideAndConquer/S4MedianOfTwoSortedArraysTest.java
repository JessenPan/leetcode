package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S4MedianOfTwoSortedArraysTest {

    private S4MedianOfTwoSortedArrays medianOfTwoSortedArrays = new S4MedianOfTwoSortedArrays();

    @Test
    public void test1() {
        double d = medianOfTwoSortedArrays.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
        Assert.assertEquals(2.0, d, 0);
    }

    @Test
    public void test2() {
        double d = medianOfTwoSortedArrays.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
        Assert.assertEquals(2.5, d, 0);
    }

}
