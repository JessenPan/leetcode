package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S459RepeatedSubstringPatternTest {

    private S459RepeatedSubstringPattern repeatedSubstringPattern = new S459RepeatedSubstringPattern();

    @Test
    public void test1() {
        boolean isRepeated = repeatedSubstringPattern.repeatedSubstringPattern("abab");
        Assert.assertTrue(isRepeated);
    }

    @Test
    public void test2() {
        boolean isRepeated = repeatedSubstringPattern.repeatedSubstringPattern("aba");
        Assert.assertFalse(isRepeated);
    }

    @Test
    public void test3() {
        boolean isRepeated = repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc");
        Assert.assertTrue(isRepeated);
    }

    @Test
    public void test4() {
        boolean isRepeated = repeatedSubstringPattern.repeatedSubstringPattern("bb");
        Assert.assertTrue(isRepeated);
    }
}
