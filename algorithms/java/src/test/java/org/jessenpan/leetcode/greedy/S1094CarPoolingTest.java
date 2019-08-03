package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1094CarPoolingTest {

    private S1094CarPooling carPooling = new S1094CarPooling();

    @Test
    public void test1() {
        boolean b = carPooling.carPooling(new int[][] { { 2, 1, 5 }, { 3, 3, 7 } }, 4);
        Assert.assertFalse(b);
    }

    @Test
    public void test2() {
        boolean b = carPooling.carPooling(new int[][] { { 2, 1, 5 }, { 3, 3, 7 } }, 5);
        Assert.assertTrue(b);
    }

    @Test
    public void test3() {
        boolean b = carPooling.carPooling(new int[][] { { 2, 1, 5 }, { 3, 5, 7 } }, 3);
        Assert.assertTrue(b);
    }

    @Test
    public void test4() {
        boolean b = carPooling.carPooling(new int[][] { { 3, 2, 7 }, { 3, 7, 9 }, { 8, 3, 9 } }, 11);
        Assert.assertTrue(b);
    }

    @Test
    public void test5() {
        boolean b = carPooling.carPooling(new int[][] { { 3, 2, 8 }, { 4, 4, 6 }, { 10, 8, 9 } }, 11);
        Assert.assertTrue(b);
    }

}
