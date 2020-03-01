package org.jessenpan.leetcode.minimax;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S292NimGameTest {

    private S292NimGame nimGame = new S292NimGame();

    @Test
    public void test1() {
        boolean isWin = nimGame.canWinNim(9);
        Assert.assertTrue(isWin);
    }

}
