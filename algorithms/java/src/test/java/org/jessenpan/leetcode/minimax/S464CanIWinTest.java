package org.jessenpan.leetcode.minimax;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 * tag:minimax
 */
public class S464CanIWinTest {

    private S464CanIWin canIWin = new S464CanIWin();

    @Test
    public void test1() {
        boolean win = canIWin.canIWin(10, 11);
        Assert.assertFalse(win);
    }

    @Test
    public void test2() {
        boolean win = canIWin.canIWin(4, 6);
        Assert.assertTrue(win);
    }

    @Test
    public void test3() {
        boolean win = canIWin.canIWin(10, 0);
        Assert.assertTrue(win);
    }

}
