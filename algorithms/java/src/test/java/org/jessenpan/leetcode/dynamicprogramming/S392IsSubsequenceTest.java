package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S392IsSubsequenceTest {

    private S392IsSubsequence isSubsequence = new S392IsSubsequence();

    @Test
    public void test1() {
        boolean isValid = isSubsequence.isSubsequence("abc", "ahbgdc");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = isSubsequence.isSubsequence("axc", "ahbgdc");
        Assert.assertFalse(isValid);
    }

}
