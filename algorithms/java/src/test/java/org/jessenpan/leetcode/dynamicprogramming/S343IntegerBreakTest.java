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
        Assert.assertEquals(2, v);
    }

    @Test
    public void test2() {
        int v = integerBreak.integerBreak(10);
        Assert.assertEquals(36, v);
    }

}
