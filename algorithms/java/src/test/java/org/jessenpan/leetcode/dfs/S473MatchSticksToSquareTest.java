package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S473MatchSticksToSquareTest {

    private S473MatchSticksToSquare matchSticksToSquare = new S473MatchSticksToSquare();

    @Test
    public void test1() {
        boolean valid = matchSticksToSquare.makesquare(new int[] { 1, 1, 2, 2, 2 });
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = matchSticksToSquare.makesquare(new int[] { 3, 3, 3, 3, 4 });
        Assert.assertFalse(valid);
    }

    @Test
    public void test3() {
        boolean valid = matchSticksToSquare.makesquare(new int[] { 5,5,5,5,16,4,4,4,4,4,3,3,3,3,4 });
        Assert.assertFalse(valid);
    }

}
