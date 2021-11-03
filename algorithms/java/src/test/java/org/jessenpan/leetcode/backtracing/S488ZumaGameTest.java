package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S488ZumaGame;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S488ZumaGameTest {

    private S488ZumaGame zumaGame = new S488ZumaGame();

    @Test
    public void test1() {
        int t = zumaGame.findMinStep("WRRBBW", "RB");
        Assert.assertEquals(-1, t);
    }

    @Test
    public void test2() {
        int t = zumaGame.findMinStep("WWRRBBWW", "WRBRW");
        Assert.assertEquals(2, t);
    }

    @Test
    public void test3() {
        int t = zumaGame.findMinStep("G", "GGGGG");
        Assert.assertEquals(2, t);
    }

    @Test
    public void test4() {
        int t = zumaGame.findMinStep("RBYYBBRRB", "YRBGB");
        Assert.assertEquals(3, t);
    }

}
