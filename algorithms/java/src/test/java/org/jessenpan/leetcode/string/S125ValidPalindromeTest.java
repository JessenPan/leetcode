package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.string.S125ValidPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S125ValidPalindromeTest {

    private S125ValidPalindrome validPalindrome = new S125ValidPalindrome();

    @Test
    public void test1() {
        boolean isPalindrome = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(isPalindrome);
    }

    @Test
    public void test2() {
        boolean isPalindrome = validPalindrome.isPalindrome("race a car");
        assertFalse(isPalindrome);
    }

}
