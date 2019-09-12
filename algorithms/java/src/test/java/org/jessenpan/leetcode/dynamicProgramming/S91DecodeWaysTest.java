package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S91DecodeWaysTest {

    private S91DecodeWays decodeWays = new S91DecodeWays();

    @Test
    public void test1() {
        int num = decodeWays.numDecodings("12");
        Assert.assertEquals(2, num);
    }

    @Test
    public void test2() {
        int num = decodeWays.numDecodings("226");
        Assert.assertEquals(3, num);
    }

    @Test
    public void test3() {
        int num = decodeWays.numDecodings("10");
        Assert.assertEquals(1, num);
    }

    @Test
    public void test4() {
        int num = decodeWays.numDecodings("00");
        Assert.assertEquals(0, num);
    }

    @Test
    public void test5() {
        int num = decodeWays.numDecodings("011");
        Assert.assertEquals(0, num);
    }


    @Test
    public void test6() {
        int num = decodeWays.numDecodings("230");
        Assert.assertEquals(0, num);
    }


    @Test
    public void test7() {
        int num = decodeWays.numDecodings("101");
        Assert.assertEquals(1, num);
    }

}
