package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S316RemoveDuplicateLettersTest {

    private S316RemoveDuplicateLetters removeDuplicateLetters = new S316RemoveDuplicateLetters();

    @Test
    public void test1() {
        String letter = removeDuplicateLetters.removeDuplicateLetters("bcabc");
        Assert.assertEquals("abc", letter);
    }

    @Test
    public void test2() {
        String letter = removeDuplicateLetters.removeDuplicateLetters("cbacdcbc");
        Assert.assertEquals("acdb", letter);
    }

}
