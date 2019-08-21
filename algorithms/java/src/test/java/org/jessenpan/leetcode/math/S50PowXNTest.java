package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S50PowXNTest {

    private S50PowXN powXN = new S50PowXN();

    @Test
    public void test1() {
        double d = powXN.myPow(2.0000, 10);
        Assert.assertEquals(1024.00000, d,0);
    }

    @Test
    public void test2() {
        double d = powXN.myPow( 2.10000, 3);
        Assert.assertEquals( 9.26100, d,0);
    }

    @Test
    public void test3() {
        double d = powXN.myPow( 2.00000, -2);
        Assert.assertEquals( 0.25000, d,0);
    }

}
