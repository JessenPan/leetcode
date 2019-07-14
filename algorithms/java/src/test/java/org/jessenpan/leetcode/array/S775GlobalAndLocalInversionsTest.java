package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S775GlobalAndLocalInversionsTest {

    private S775GlobalAndLocalInversions globalAndLocalInversions = new S775GlobalAndLocalInversions();

    @Test
    public void test1() {
        boolean isEqual = globalAndLocalInversions.isIdealPermutation(new int[] { 1, 0, 2 });
        Assert.assertTrue(isEqual);
    }

    @Test
    public void test2() {
        boolean isEqual = globalAndLocalInversions.isIdealPermutation(new int[] { 1, 2, 0 });
        Assert.assertFalse(isEqual);
    }

}
