package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S877StoneGameTest {

    private S877StoneGame stoneGame = new S877StoneGame();

    @Test
    public void test1() {
        boolean isValid = stoneGame.stoneGame(new int[] { 5, 3, 4, 5 });
        Assert.assertTrue(isValid);
    }

}
