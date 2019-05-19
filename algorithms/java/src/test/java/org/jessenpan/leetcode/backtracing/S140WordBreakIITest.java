package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S140WordBreakII;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S140WordBreakIITest {

    private S140WordBreakII wordBreakII = new S140WordBreakII();

    @Test
    public void test1() {
        List<String> words = wordBreakII.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Assert.assertEquals(Arrays.asList("cats and dog", "cat sand dog"), words);
    }

    @Test
    public void test2() {
        List<String> words = wordBreakII.wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        Assert.assertEquals(Arrays.asList("pine apple pen apple", "pineapple pen apple", "pine applepen apple"), words);
    }

    @Test
    public void test3() {
        List<String> words = wordBreakII.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
        Assert.assertTrue(words.isEmpty());
    }

    @Test
    public void test4() {
        List<String> words = wordBreakII.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
    }
   

}
