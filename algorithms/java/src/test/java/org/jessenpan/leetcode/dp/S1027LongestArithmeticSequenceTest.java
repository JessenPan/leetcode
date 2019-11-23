package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1027LongestArithmeticSequenceTest {

    private S1027LongestArithmeticSequence longestArithmeticSequence = new S1027LongestArithmeticSequence();

    @Test
    public void test1() {
        int v = longestArithmeticSequence.longestArithSeqLength(new int[] { 3, 6, 9, 12 });
        Assert.assertEquals(4, v);
    }

    @Test
    public void test2() {
        int v = longestArithmeticSequence.longestArithSeqLength(new int[] { 9, 4, 7, 2, 10 });
        Assert.assertEquals(3, v);
    }

    @Test
    public void test3() {
        int v = longestArithmeticSequence.longestArithSeqLength(new int[] { 20, 1, 15, 3, 10, 5, 8 });
        Assert.assertEquals(4, v);
    }

    @Test
    public void test4() {
        int v = longestArithmeticSequence.longestArithSeqLength(new int[] { 24, 13, 1, 100, 0, 94, 3, 0, 3 });
        Assert.assertEquals(2, v);
    }

}
