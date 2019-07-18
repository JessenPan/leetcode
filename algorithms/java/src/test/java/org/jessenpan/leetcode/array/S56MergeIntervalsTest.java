package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S56MergeIntervalsTest {

    private S56MergeIntervals mergeIntervals = new S56MergeIntervals();

    @Test
    public void test1() {
        int[][] intervals = mergeIntervals.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });
        Assert.assertArrayEquals(new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } }, intervals);
    }

    @Test
    public void test2() {
        int[][] intervals = mergeIntervals.merge(new int[][] { { 1, 4 }, { 4, 5 } });
        Assert.assertArrayEquals(new int[][] { { 1, 5 } }, intervals);
    }

    @Test
    public void test3() {
        int[][] intervals = mergeIntervals.merge(new int[][] { { 1, 4 }, { 2, 3 } });
        Assert.assertArrayEquals(new int[][] { { 1, 4 } }, intervals);
    }

}
