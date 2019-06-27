package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S946ValidateStackSequencesTest {

    private S946ValidateStackSequences validateStackSequences = new S946ValidateStackSequences();

    @Test
    public void test1() {
        boolean isValid = validateStackSequences.validateStackSequences(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 });
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = validateStackSequences.validateStackSequences(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 3, 5, 1, 2 });
        Assert.assertFalse(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = validateStackSequences.validateStackSequences(new int[] { 0 }, new int[] { 0 });
        Assert.assertTrue(isValid);
    }

}
