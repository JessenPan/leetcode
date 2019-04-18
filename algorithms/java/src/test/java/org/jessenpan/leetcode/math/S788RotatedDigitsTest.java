package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S788RotatedDigitsTest {

    private S788RotatedDigits rotatedDigits = new S788RotatedDigits();

    @Test
    public void test1() {
        int count = rotatedDigits.rotatedDigits(10);
        assertEquals(4,count);
    }

}
