package org.jessenpan.leetcode.math;

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

}
