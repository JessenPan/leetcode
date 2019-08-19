package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S995MinimumNumberOfKConsecutiveBitFlipsTest {

    private S995MinimumNumberOfKConsecutiveBitFlips minimumNumberOfKConsecutiveBitFlips = new S995MinimumNumberOfKConsecutiveBitFlips();

    @Test
    public void test1() {
        int n = minimumNumberOfKConsecutiveBitFlips.minKBitFlips(new int[] { 0, 1, 0 }, 1);
        Assert.assertEquals(2, n);
    }

    @Test
    public void test2() {
        int n = minimumNumberOfKConsecutiveBitFlips.minKBitFlips(new int[] { 1, 1, 0 }, 2);
        Assert.assertEquals(-1, n);
    }

    @Test
    public void test3() {
        int n = minimumNumberOfKConsecutiveBitFlips.minKBitFlips(new int[] { 0, 0, 0, 1, 0, 1, 1, 0 }, 3);
        Assert.assertEquals(3, n);
    }

}
