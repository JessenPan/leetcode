package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S279PerfectSquaresTest {

    private S279PerfectSquares perfectSquares = new S279PerfectSquares();

    @Test
    public void test1() {
        int n = perfectSquares.numSquares(12);
        Assert.assertEquals(3, n);
    }

    @Test
    public void test2() {
        int n = perfectSquares.numSquares(13);
        Assert.assertEquals(2, n);
    }

    @Test
    public void test3() {
        int n = perfectSquares.numSquares(52);
        Assert.assertEquals(2, n);
    }

}
