package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S343IntegerBreakTest {

    private S343IntegerBreak integerBreak = new S343IntegerBreak();

    @Test
    public void test1() {
        int v = integerBreak.integerBreak(2);
        Assert.assertEquals(1, v);
    }

    @Test
    public void test2() {
        int v = integerBreak.integerBreak(10);
        Assert.assertEquals(36, v);
    }

    @Test
    public void test3() {
        int v = integerBreak.integerBreak(42);
        Assert.assertEquals(4782969, v);
    }

}
