package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.math.S231PowerOfTwo;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S231PowerOfTwoTest {

    private S231PowerOfTwo powerOfTwo = new S231PowerOfTwo();

    @Test
    public void test1() {
        boolean isPowerOfTwo = powerOfTwo.isPowerOfTwo(4);
        assertTrue(isPowerOfTwo);
    }

    @Test
    public void test2() {
        boolean isPowerOfTwo=powerOfTwo.isPowerOfTwo(2147483646);
        assertFalse(isPowerOfTwo);
    }

    @Test
    public void test3() {
        boolean isPowerOfTwo=powerOfTwo.isPowerOfTwo(6);
        assertFalse(isPowerOfTwo);
    }

}
