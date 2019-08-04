package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S738MonotoneIncreasingDigitsTest {

    private S738MonotoneIncreasingDigits monotoneIncreasingDigits = new S738MonotoneIncreasingDigits();

    @Test
    public void test1() {
        int d = monotoneIncreasingDigits.monotoneIncreasingDigits(10);
        Assert.assertEquals(9, d);
    }

    @Test
    public void test2() {
        int d = monotoneIncreasingDigits.monotoneIncreasingDigits(1234);
        Assert.assertEquals(1234, d);
    }

    @Test
    public void test3() {
        int d = monotoneIncreasingDigits.monotoneIncreasingDigits(332);
        Assert.assertEquals(299, d);
    }

}
