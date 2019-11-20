package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S300LongestIncreasingSubsequenceTest {

    private S300LongestIncreasingSubsequence longestIncreasingSubsequence = new S300LongestIncreasingSubsequence();

    @Test
    public void test1() {
        int t = longestIncreasingSubsequence.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 });
        Assert.assertEquals(4, t);
    }

    @Test
    public void test2() {
        int t = longestIncreasingSubsequence.lengthOfLIS(new int[] { 4, 4, 4, 4, 4 });
        Assert.assertEquals(1, t);
    }

    @Test
    public void test3() {
        int t = longestIncreasingSubsequence.lengthOfLIS(new int[] { 4, 10, 4, 3, 8, 9 });
        Assert.assertEquals(3, t);
    }

}
