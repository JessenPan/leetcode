package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S55JumpGameTest {

    private S55JumpGame jumpGame = new S55JumpGame();

    @Test
    public void test1() {
        boolean canJump = jumpGame.canJump(new int[] { 2, 3, 1, 1, 4 });
        Assert.assertTrue(canJump);
    }

    @Test
    public void test2() {
        boolean canJump = jumpGame.canJump(new int[] { 3, 2, 1, 0, 4 });
        Assert.assertFalse(canJump);
    }

    @Test
    public void test3() {
        boolean canJump = jumpGame.canJump(new int[] { 0 });
        Assert.assertTrue(canJump);
    }

}
