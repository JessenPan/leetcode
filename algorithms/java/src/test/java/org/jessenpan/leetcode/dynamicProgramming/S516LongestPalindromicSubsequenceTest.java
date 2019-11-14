package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S516LongestPalindromicSubsequenceTest {

    private S516LongestPalindromicSubsequence longestPalindromicSubsequence = new S516LongestPalindromicSubsequence();

    @Test
    public void test1() {
        int t = longestPalindromicSubsequence.longestPalindromeSubseq("bbbab");
        Assert.assertEquals(4, t);
    }

    @Test
    public void test2() {
        int t = longestPalindromicSubsequence.longestPalindromeSubseq("cbbd");
        Assert.assertEquals(2, t);
    }

}
