package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S659SplitArrayIntoConsecutiveSubsequencesTest {

    private S659SplitArrayIntoConsecutiveSubsequences splitArrayIntoConsecutiveSubsequences = new S659SplitArrayIntoConsecutiveSubsequences();

    @Test
    public void test1() {
        boolean isValid = splitArrayIntoConsecutiveSubsequences.isPossible(new int[] { 1, 2, 3, 3, 4, 5 });
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = splitArrayIntoConsecutiveSubsequences.isPossible(new int[] { 1, 2, 3, 3, 4, 4, 5, 5 });
        Assert.assertTrue(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = splitArrayIntoConsecutiveSubsequences.isPossible(new int[] { 1, 2, 3, 4, 4, 5 });
        Assert.assertFalse(isValid);
    }

}
