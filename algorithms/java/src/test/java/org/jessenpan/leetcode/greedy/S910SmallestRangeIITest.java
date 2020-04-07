package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S910SmallestRangeIITest {

    private S910SmallestRangeII smallestRangeII = new S910SmallestRangeII();

    @Test
    public void test1() {
        int t = smallestRangeII.smallestRangeII(new int[] { 1 }, 0);
        Assert.assertEquals(0, t);
    }

    @Test
    public void test2() {
        int t = smallestRangeII.smallestRangeII(new int[] { 0, 10 }, 2);
        Assert.assertEquals(6, t);
    }

    @Test
    public void test3() {
        int t = smallestRangeII.smallestRangeII(new int[] { 1, 3, 6 }, 3);
        Assert.assertEquals(3, t);
    }
}
