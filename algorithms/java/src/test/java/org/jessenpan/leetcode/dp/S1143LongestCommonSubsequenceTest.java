package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1143LongestCommonSubsequenceTest {

    private S1143LongestCommonSubsequence longestCommonSubsequence = new S1143LongestCommonSubsequence();

    @Test
    public void test1() {
        int t = longestCommonSubsequence.longestCommonSubsequence("abcde", "ace");
        Assert.assertEquals(3, t);
    }
    
    @Test
    public void test2(){
        int t = longestCommonSubsequence.longestCommonSubsequence("abc", "abc");
        Assert.assertEquals(3,t);
    }

    @Test
    public void test3(){
        int t = longestCommonSubsequence.longestCommonSubsequence("abc", "def");
        Assert.assertEquals(0,t);
    }

}
