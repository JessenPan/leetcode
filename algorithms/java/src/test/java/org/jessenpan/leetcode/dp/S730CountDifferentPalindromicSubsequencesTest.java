package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S730CountDifferentPalindromicSubsequencesTest {

    private S730CountDifferentPalindromicSubsequences countDifferentPalindromicSubsequences = new S730CountDifferentPalindromicSubsequences();
    
    @Test
    public void test1(){
       int t= countDifferentPalindromicSubsequences.countPalindromicSubsequences("bccb");
        Assert.assertEquals(6, t);
    }

    @Test
    public void test2(){
        int t= countDifferentPalindromicSubsequences.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba");
        Assert.assertEquals(104860361, t);
    }

}
