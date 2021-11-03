package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S906SuperPalindromesTest {

    private S906SuperPalindromes superPalindromes = new S906SuperPalindromes();

    @Test
    public void test1() {
        int t = superPalindromes.superpalindromesInRange("4", "1000");
        Assert.assertEquals(4, t);
    }

}
