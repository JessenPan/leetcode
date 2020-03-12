package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S322CoinChangeTest {

    private S322CoinChange coinChange = new S322CoinChange();

    @Test
    public void test1() {
        int t = coinChange.coinChange(new int[] { 1, 2, 5 }, 11);
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = coinChange.coinChange(new int[] { 2 }, 3);
        Assert.assertEquals(-1, t);
    }

    @Test
    public void test3() {
        int t = coinChange.coinChange(new int[] { 1  }, 0);
        Assert.assertEquals(0, t);
    }

}
