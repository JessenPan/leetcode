package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S886PrimePalindromeTest {

    private S886PrimePalindrome primePalindrome = new S886PrimePalindrome();

    @Test
    public void test1() {
        int t = primePalindrome.primePalindrome(6);
        Assert.assertEquals(7, t);
    }

    @Test
    public void test2() {
        int t = primePalindrome.primePalindrome(8);
        Assert.assertEquals(11, t);
    }

    @Test
    public void test3() {
        int t = primePalindrome.primePalindrome(13);
        Assert.assertEquals(101, t);
    }

    @Test
    public void test4() {
        int t = primePalindrome.primePalindrome(102);
        Assert.assertEquals(101, t);
    }

}
