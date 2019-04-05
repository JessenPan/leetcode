package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S283MoveZerosTest {

    private S283MoveZeros moveZeros = new S283MoveZeros();

    @Test
    public void test1() {
        int[] origin = new int[] { 0, 2, 1, 2, 0 };
        moveZeros.moveZeroes(origin);
        assertArrayEquals(new int[] { 2, 1, 2, 0, 0 }, origin);
    }

    @Test
    public void test2() {
        int[] origin = new int[] { 0, 1, 0, 3, 12 };
        moveZeros.moveZeroes(origin);
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, origin);
    }

    @Test
    public void test3() {
        int[] origin = new int[] { 0, 0 };
        moveZeros.moveZeroes(origin);
        assertArrayEquals(new int[] { 0, 0 }, origin);
    }

    @Test
    public void test4() {
        int[] origin = new int[] { 0, 0, 1 };
        moveZeros.moveZeroes(origin);
        assertArrayEquals(new int[] { 1, 0, 0 }, origin);
    }

}
