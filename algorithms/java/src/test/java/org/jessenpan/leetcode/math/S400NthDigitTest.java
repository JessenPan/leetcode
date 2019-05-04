package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S400NthDigitTest {

    private S400NthDigit nthDigit = new S400NthDigit();

    @Test
    public void test1() {
        int digit = nthDigit.findNthDigit(3);
        Assert.assertEquals(3, digit);
    }

    @Test
    public void test2() {
        int digit = nthDigit.findNthDigit(11);
        Assert.assertEquals(0, digit);
    }

}
