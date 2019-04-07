package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S896MonotonicArrayTest {

    private S896MonotonicArray monotonicArray = new S896MonotonicArray();

    @Test
    public void test1() {
        boolean isMonotonic = monotonicArray.isMonotonic(new int[] { 1, 2, 2, 3 });
        assertTrue(isMonotonic);
    }

    @Test
    public void test2() {
        boolean isMonotonic = monotonicArray.isMonotonic(new int[] { 6, 5, 4, 4 });
        assertTrue(isMonotonic);
    }

    @Test
    public void test3() {
        boolean isMonotonic = monotonicArray.isMonotonic(new int[] { 1, 3, 2 });
        assertFalse(isMonotonic);
    }

    @Test
    public void test4() {
        boolean isMonotonic = monotonicArray.isMonotonic(new int[] { 1, 2, 4, 5 });
        assertTrue(isMonotonic);
    }

    @Test
    public void test5() {
        boolean isMonotonic = monotonicArray.isMonotonic(new int[] { 1, 1, 1 });
        assertTrue(isMonotonic);
    }
}
