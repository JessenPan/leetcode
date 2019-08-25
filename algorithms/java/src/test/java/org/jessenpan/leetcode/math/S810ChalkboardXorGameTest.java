package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S810ChalkboardXorGameTest {

    private S810ChalkboardXorGame chalkboardXorGame = new S810ChalkboardXorGame();

    @Test
    public void test1() {
        boolean r = chalkboardXorGame.xorGame(new int[] { 1, 1, 2 });
        Assert.assertFalse(r);
    }

}
