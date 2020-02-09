package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S873LengthOfLongestFibonacciSubsequenceTest {

    private S873LengthOfLongestFibonacciSubsequence lengthOfLongestFibonacciSubsequence = new S873LengthOfLongestFibonacciSubsequence();

    @Test
    public void test1() {
        int len = lengthOfLongestFibonacciSubsequence.lenLongestFibSubseq(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        Assert.assertEquals(5, len);
    }

    @Test
    public void test2() {
        int len = lengthOfLongestFibonacciSubsequence.lenLongestFibSubseq(new int[] { 1, 3, 7, 11, 12, 14, 18 });
        Assert.assertEquals(3, len);
    }

}
