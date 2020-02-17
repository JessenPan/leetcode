package org.jessenpan.leetcode.doublepointer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S567PermutationInStringTest {

    private S567PermutationInString permutationInString = new S567PermutationInString();

    @Test
    public void test1() {
        boolean valid = permutationInString.checkInclusion("ab", "eidbaooo");
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = permutationInString.checkInclusion("ab", "eidboaoo");
        Assert.assertFalse(valid);
    }

}
