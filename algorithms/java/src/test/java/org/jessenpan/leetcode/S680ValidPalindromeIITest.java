package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S680ValidPalindromeIITest {

    private S680ValidPalindromeII validPalindromeII = new S680ValidPalindromeII();

    @Test
    public void test1() {
        boolean isValid = validPalindromeII.validPalindrome("aba");
        assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = validPalindromeII.validPalindrome("abca");
        assertTrue(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = validPalindromeII.validPalindrome("acbca");
        assertTrue(isValid);
    }
}
