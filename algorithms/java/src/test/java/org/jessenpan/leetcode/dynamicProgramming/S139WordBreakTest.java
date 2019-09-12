package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S139WordBreakTest {

    private S139WordBreak wordBreak = new S139WordBreak();

    @Test
    public void test1() {
        boolean isValid = wordBreak.wordBreak("leetcode", Arrays.asList("leet", "code"));
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = wordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen"));
        Assert.assertTrue(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = wordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
        Assert.assertFalse(isValid);
    }

    @Test
    public void test4() {
        boolean isValid = wordBreak.wordBreak("bb", Arrays.asList("a", "b", "bbb", "bbbb"));
        Assert.assertTrue(isValid);
    }

}
