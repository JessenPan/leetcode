package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S372SuperPowTest {

    private S372SuperPow superPow = new S372SuperPow();

    @Test
    public void test1() {
        int t = superPow.superPow(2, new int[] { 3 });
        Assert.assertEquals(8, t);
    }

    @Test
    public void test2() {
        int t = superPow.superPow(2, new int[] { 1, 0 });
        Assert.assertEquals(1024, t);
    }

    @Test
    public void test3() {
        int t = superPow.superPow(2147483647, new int[] { 2, 0, 0 });
        Assert.assertEquals(1198, t);
    }

}
