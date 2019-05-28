package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S44WildcardMatching;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S44WildcardMatchingTest {

    private S44WildcardMatching wildcardMatching = new S44WildcardMatching();

    @Test
    public void test1() {
        boolean isMatch = wildcardMatching.isMatch("adceb", "*a*b");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void test2() {
        boolean isMatch = wildcardMatching.isMatch("acdcb", "a*c?b");
        Assert.assertFalse(isMatch);
    }

    @Test
    public void test3() {
        boolean isMatch = wildcardMatching.isMatch("aa", "a");
        Assert.assertFalse(isMatch);
    }

    @Test
    public void test4() {
        boolean isMatch = wildcardMatching.isMatch("aa", "*");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void test5() {
        boolean isMatch = wildcardMatching.isMatch("cb", "?a");
        Assert.assertFalse(isMatch);
    }

    @Test
    public void test6() {
        boolean isMatch = wildcardMatching.isMatch("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b");
        Assert.assertFalse(isMatch);
    }
}
