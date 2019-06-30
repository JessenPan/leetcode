package org.jessenpan.leetcode.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S239SlidingWindowMaximumTest {

    private S239SlidingWindowMaximum slidingWindowMaximum = new S239SlidingWindowMaximum();

    @Test
    public void test1() {
        int[] maxs = slidingWindowMaximum.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3);
        Assert.assertArrayEquals(new int[] { 3, 3, 5, 5, 6, 7 }, maxs);
    }

    @Test
    public void test2() {
        int[] maxs = slidingWindowMaximum.maxSlidingWindow(new int[] { 9, 10, 9, -7, -4, -8, 2, -6 }, 5);
        Assert.assertArrayEquals(new int[] { 10, 10, 9, 2 }, maxs);
    }

}
