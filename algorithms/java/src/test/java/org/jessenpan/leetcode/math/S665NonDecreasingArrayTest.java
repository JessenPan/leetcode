package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.array.S665NonDecreasingArray;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S665NonDecreasingArrayTest {

    private S665NonDecreasingArray nonDecreasingArray = new S665NonDecreasingArray();

    @Test
    public void test1() {
        boolean isNonDecreasing = nonDecreasingArray.checkPossibility(new int[] { 4, 2, 3 });
        assertTrue(isNonDecreasing);
    }

    @Test
    public void test2() {
        boolean isNonDecreasing = nonDecreasingArray.checkPossibility(new int[] { 4, 2, 1 });
        assertFalse(isNonDecreasing);
    }

    @Test
    public void test3() {
        boolean isNonDecreasing = nonDecreasingArray.checkPossibility(new int[] { -1, 4, 2, 3 });
        assertTrue(isNonDecreasing);
    }

    @Test
    public void test4() {
        boolean isNonDecreasing = nonDecreasingArray.checkPossibility(new int[] { 3, 4, 2, 3 });
        assertFalse(isNonDecreasing);
    }

    @Test
    public void test5() {
        boolean isNonDecreasing = nonDecreasingArray.checkPossibility(new int[] { 2, 3, 3, 2, 4 });
        assertTrue(isNonDecreasing);
    }

}
