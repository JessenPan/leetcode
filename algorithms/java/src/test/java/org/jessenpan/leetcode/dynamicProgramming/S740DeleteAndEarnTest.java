package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S740DeleteAndEarnTest {

    private S740DeleteAndEarn deleteAndEarn = new S740DeleteAndEarn();

    @Test
    public void test1() {
        int n = deleteAndEarn.deleteAndEarn(new int[] { 3, 4, 2 });
        Assert.assertEquals(6, n);
    }

    @Test
    public void test2() {
        int n = deleteAndEarn.deleteAndEarn(new int[] { 2, 2, 3, 3, 3, 4 });
        Assert.assertEquals(9, n);
    }

    @Test
    public void test3() {
        int n = deleteAndEarn.deleteAndEarn(new int[] { 8, 3, 4, 7, 6, 6, 9, 2, 5, 8, 2, 4, 9, 5, 9, 1, 5, 7, 1, 4 });
        Assert.assertEquals(61, n);
    }

}
