package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S290WordPatternTest {

    private S290WordPattern wordPattern = new S290WordPattern();

    @Test
    public void test1() {
        boolean isMatch = wordPattern.wordPattern("abba", "dog cat cat dog");
        assertTrue(isMatch);
    }

    @Test
    public void test2() {
        boolean isMatch = wordPattern.wordPattern("abba", "dog cat cat fish");
        assertFalse(isMatch);
    }

    @Test
    public void test3() {
        boolean isMatch = wordPattern.wordPattern("aaaa", "dog cat cat dog");
        assertFalse(isMatch);
    }

    @Test
    public void test4() {
        boolean isMatch = wordPattern.wordPattern("abba", "dog dog dog dog");
        assertFalse(isMatch);
    }

    @Test
    public void test5() {
        boolean isMatch = wordPattern.wordPattern("jquery", "jquery");
        assertFalse(isMatch);
    }

    @Test
    public void test6() {
        boolean isMatch = wordPattern.wordPattern("aaa", "aa aa aa aa");
        assertFalse(isMatch);
    }

}
