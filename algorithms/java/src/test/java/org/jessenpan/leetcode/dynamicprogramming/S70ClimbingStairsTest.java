package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S70ClimbingStairsTest {

    private S70ClimbingStairs climbingStairs = new S70ClimbingStairs();

    @Test
    public void test1() {
        int n = climbingStairs.climbStairs(2);
        Assert.assertEquals(2, n);
    }

    @Test
    public void test2() {
        int n = climbingStairs.climbStairs(3);
        Assert.assertEquals(3, n);
    }

    @Test
    public void test3() {
        int n = climbingStairs.climbStairs(4);
        Assert.assertEquals(5, n);
    }

    @Test
    public void test4() {
        int n = climbingStairs.climbStairs(1);
        Assert.assertEquals(1, n);
    }

}
