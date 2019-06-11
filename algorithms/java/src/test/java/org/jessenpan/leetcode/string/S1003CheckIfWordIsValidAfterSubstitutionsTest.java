package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1003CheckIfWordIsValidAfterSubstitutionsTest {

    private S1003CheckIfWordIsValidAfterSubstitutions checkIfWordIsValidAfterSubstitutions = new S1003CheckIfWordIsValidAfterSubstitutions();

    @Test
    public void test1() {
        boolean isValid = checkIfWordIsValidAfterSubstitutions.isValid("aabcbc");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = checkIfWordIsValidAfterSubstitutions.isValid("abcabcababcc");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = checkIfWordIsValidAfterSubstitutions.isValid("abccba");
        Assert.assertFalse(isValid);
    }

    @Test
    public void test4() {
        boolean isValid = checkIfWordIsValidAfterSubstitutions.isValid("cababc");
        Assert.assertFalse(isValid);
    }

}
