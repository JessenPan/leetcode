package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S453MinimumMovesToEqualArrayElementsTest {

    private S453MinimumMovesToEqualArrayElements minimumMovesToEqualArrayElements = new S453MinimumMovesToEqualArrayElements();

    @Test
    public void test1() {
        int minMove = minimumMovesToEqualArrayElements.minMoves(new int[] { 1, 2, 3 });
        assertEquals(3, minMove);
    }

    @Test
    public void test2() {
        int minMove = minimumMovesToEqualArrayElements.minMoves(new int[] { 1, 1, 2147483647 });
        assertEquals(2147483646, minMove);
    }

}
