package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S1079LetterTilePossibilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1079LetterTilePossibilitiesTest {

    private S1079LetterTilePossibilities letterTilePossibilities = new S1079LetterTilePossibilities();

    @Test
    public void test1() {
        int t = letterTilePossibilities.numTilePossibilities("AAB");
        Assert.assertEquals(8, t);
    }

    @Test
    public void test2() {
        int t = letterTilePossibilities.numTilePossibilities("AAABBC");
        Assert.assertEquals(188, t);
    }

}
