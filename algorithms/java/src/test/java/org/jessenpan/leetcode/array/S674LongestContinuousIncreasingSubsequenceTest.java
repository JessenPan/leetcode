package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S674LongestContinuousIncreasingSubsequenceTest {

    private S674LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new S674LongestContinuousIncreasingSubsequence();

    @Test
    public void test1() {
        int maxLength = longestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[] { 1, 3, 5, 4, 7 });
        assertEquals(3, maxLength);
    }

    @Test
    public void test2() {
        int maxLength = longestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[] { 2, 2, 2, 2, 2 });
        assertEquals(1, maxLength);
    }

    @Test
    public void test3() {
        int maxLength = longestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[] { 1, 3, 5, 4, 2, 3, 4, 5 });
        assertEquals(4, maxLength);
    }

}
