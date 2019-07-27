package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S204CountPrimesTest {

    private S204CountPrimes countPrimes = new S204CountPrimes();

    @Test
    public void test1() {
        int cnt = countPrimes.countPrimes(10);
        Assert.assertEquals(4, cnt);
    }

    @Test
    public void test3() {
        int cnt = countPrimes.countPrimes(3);
        Assert.assertEquals(1, cnt);
    }

    @Test
    public void test5() {
        int cnt = countPrimes.countPrimes(5);
        Assert.assertEquals(2, cnt);
    }

    @Test
    public void test6() {
        int cnt = countPrimes.countPrimes(10000);
        Assert.assertEquals(1229, cnt);
    }

}
