package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S326PowerOfThreeTest {

    private S326PowerOfThree powerOfThree = new S326PowerOfThree();

    @Test
    public void test() {
        boolean isPowerOfThree = powerOfThree.isPowerOfThree(27);
        assertTrue(isPowerOfThree);
    }

    @Test
    public void test1() {
        boolean isPowerOfThree = powerOfThree.isPowerOfThree(0);
        assertFalse(isPowerOfThree);
    }

    @Test
    public void test9() {
        boolean isPowerOfThree = powerOfThree.isPowerOfThree(9);
        assertTrue(isPowerOfThree);
    }

    @Test
    public void test10() {
        boolean isPowerOfThree = powerOfThree.isPowerOfThree(45);
        assertFalse(isPowerOfThree);
    }
}
