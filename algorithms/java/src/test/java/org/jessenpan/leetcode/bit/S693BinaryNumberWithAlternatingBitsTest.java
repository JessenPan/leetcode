package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S693BinaryNumberWithAlternatingBitsTest {

    private S693BinaryNumberWithAlternatingBits binaryNumberWithAlternatingBits = new S693BinaryNumberWithAlternatingBits();

    @Test
    public void test1() {
        boolean hasAlter = binaryNumberWithAlternatingBits.hasAlternatingBits(5);
        assertTrue(hasAlter);
    }

    @Test
    public void test2() {
        boolean hasAlter = binaryNumberWithAlternatingBits.hasAlternatingBits(7);
        assertFalse(hasAlter);
    }

    @Test
    public void test3() {
        boolean hasAlter = binaryNumberWithAlternatingBits.hasAlternatingBits(11);
        assertFalse(hasAlter);
    }

    @Test
    public void test4() {
        boolean hasAlter = binaryNumberWithAlternatingBits.hasAlternatingBits(10);
        assertTrue(hasAlter);
    }
}
