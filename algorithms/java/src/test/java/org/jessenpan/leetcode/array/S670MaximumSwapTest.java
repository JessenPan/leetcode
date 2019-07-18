package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S670MaximumSwapTest {

    private S670MaximumSwap maximumSwap = new S670MaximumSwap();

    @Test
    public void test1() {
        int max = maximumSwap.maximumSwap(2736);
        Assert.assertEquals(7236, max);
    }

    @Test
    public void test2() {
        int max = maximumSwap.maximumSwap(9973);
        Assert.assertEquals(9973, max);
    }

    @Test
    public void test3() {
        int max = maximumSwap.maximumSwap(98368);
        Assert.assertEquals(98863, max);
    }

    @Test
    public void test4() {
        int max = maximumSwap.maximumSwap(1993);
        Assert.assertEquals(9913, max);
    }

}
