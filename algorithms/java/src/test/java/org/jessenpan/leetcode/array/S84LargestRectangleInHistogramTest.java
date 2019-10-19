package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S84LargestRectangleInHistogramTest {

    private S84LargestRectangleInHistogram largestRectangleInHistogram = new S84LargestRectangleInHistogram();

    @Test
    public void test1() {
        int area = largestRectangleInHistogram.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 });
        Assert.assertEquals(10, area);
    }

}
