package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S512CoinChange2Test {

    private S512CoinChange2 coinChange2 = new S512CoinChange2();

    @Test
    public void test1() {
        int x = coinChange2.change(5, new int[] { 1, 2, 5 });
        Assert.assertEquals(4, x);
    }

    @Test
    public void test2() {
        int x = coinChange2.change(3, new int[] { 2 });
        Assert.assertEquals(0, x);
    }

    @Test
    public void test3() {
        int x = coinChange2.change(10, new int[] { 10 });
        Assert.assertEquals(1, x);
    }

}
