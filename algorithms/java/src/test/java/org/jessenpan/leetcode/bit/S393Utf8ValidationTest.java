package org.jessenpan.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S393Utf8ValidationTest {

    private S393Utf8Validation utf8Validation = new S393Utf8Validation();

    @Test
    public void test1() {
        boolean isValid = utf8Validation.validUtf8(new int[] { 197, 130, 1 });
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = utf8Validation.validUtf8(new int[] { 235, 140, 4 });
        Assert.assertFalse(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = utf8Validation.validUtf8(new int[] { 240, 162, 138, 147, 145 });
        Assert.assertFalse(isValid);
    }

    @Test
    public void test4() {
        boolean isValid = utf8Validation.validUtf8(new int[] { 248, 130, 130, 130 });
        Assert.assertFalse(isValid);
    }

}
