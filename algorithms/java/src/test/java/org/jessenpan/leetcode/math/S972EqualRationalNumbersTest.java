package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S972EqualRationalNumbersTest {

    private S972EqualRationalNumbers equalRationalNumbers = new S972EqualRationalNumbers();

    @Test
    public void test1() {
        boolean valid = equalRationalNumbers.isRationalEqual("0.(52)", "0.5(25)");
        Assert.assertTrue(valid);
    }

}
