package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1025DivisorGameTest {

    private S1025DivisorGame divisorGame = new S1025DivisorGame();

    @Test
    public void test1() {
        boolean isValid = divisorGame.divisorGame(2);
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = divisorGame.divisorGame(3);
        Assert.assertFalse(isValid);
    }

}
