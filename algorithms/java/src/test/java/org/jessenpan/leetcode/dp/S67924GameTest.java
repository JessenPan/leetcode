package org.jessenpan.leetcode.dp;

import org.jessenpan.leetcode.dfs.S67924Game;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S67924GameTest {

    private S67924Game game = new S67924Game();

    @Test
    public void test1() {
        boolean valid = game.judgePoint24(new int[] { 4, 1, 8, 7 });
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = game.judgePoint24(new int[] { 1, 2, 1, 2 });
        Assert.assertFalse(valid);
    }

}
