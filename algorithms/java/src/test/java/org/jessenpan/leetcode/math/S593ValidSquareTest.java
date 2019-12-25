package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S593ValidSquareTest {

    private S593ValidSquare validSquare = new S593ValidSquare();

    @Test
    public void test1() {
        boolean isValid = validSquare.validSquare(new int[] { 0, 0 }, new int[] { 1, 1 }, new int[] { 1, 0 }, new int[] { 0, 1 });
        Assert.assertTrue(isValid);
    }

}
