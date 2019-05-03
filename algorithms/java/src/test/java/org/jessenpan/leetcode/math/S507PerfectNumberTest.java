package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S507PerfectNumberTest {

    private S507PerfectNumber perfectNumber = new S507PerfectNumber();

    @Test
    public void test1() {
        boolean isPerfect = perfectNumber.checkPerfectNumber(28);
        Assert.assertTrue(isPerfect);
    }

    @Test
    public void test2() {
        boolean isPerfect = perfectNumber.checkPerfectNumber(100000000);
        Assert.assertFalse(isPerfect);
    }

    @Test
    public void test3() {
        boolean isPerfect = perfectNumber.checkPerfectNumber(1);
        Assert.assertFalse(isPerfect);
    }

}
