package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S327CountOfRangeSumTest {

    private S327CountOfRangeSum countOfRangeSum = new S327CountOfRangeSum();

    @Test
    public void test1() {
        int s = countOfRangeSum.countRangeSum(new int[] { -2, 5, -1 }, -2, 2);
        Assert.assertEquals(3, s);
    }

    @Test
    public void test2() {
        int s = countOfRangeSum.countRangeSum(new int[] { -2147483647,0,-2147483647,2147483647 }, -564, 3864);
        Assert.assertEquals(3, s);
    }

}
