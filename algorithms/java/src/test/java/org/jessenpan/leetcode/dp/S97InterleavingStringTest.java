package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S97InterleavingStringTest {

    private S97InterleavingString interleavingString = new S97InterleavingString();

    @Test
    public void test1() {
        boolean valid = interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac");
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc");
        Assert.assertFalse(valid);
    }

    @Test
    public void test3() {
        boolean valid = interleavingString.isInterleave("a", "", "c");
        Assert.assertFalse(valid);
    }

    @Test
    public void test4() {
        boolean valid = interleavingString.isInterleave("aacaac", "aacaaeaac", "aacaacaaeaacaac");
        Assert.assertTrue(valid);
    }

    @Test
    public void test5() {
        boolean valid = interleavingString.isInterleave("bcbccabcccbcbbbcbbacaaccccacbaccabaccbabccbabcaabbbccbbbaa", 
                "ccbccaaccabacaabccaaccbabcbbaacacaccaacbacbbccccbac",
                "bccbcccabbccaccaccacbacbacbabbcbccbaaccbbaacbcbaacbacbaccaaccabcaccacaacbacbacccbbabcccccbababcaabcbbcccbbbaa");
        Assert.assertTrue(valid);
    }

}
