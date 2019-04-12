package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S409LongestPalindromeTest {

    private S409LongestPalindrome longestPalindrome = new S409LongestPalindrome();

    @Test
    public void test1(){
        int longLength = longestPalindrome.longestPalindrome("abccccdd");
        assertEquals(7, longLength);
    }

    @Test
    public void test2(){
        int longLength = longestPalindrome.longestPalindrome("ccc");
        assertEquals(3, longLength);
    }
    
}
