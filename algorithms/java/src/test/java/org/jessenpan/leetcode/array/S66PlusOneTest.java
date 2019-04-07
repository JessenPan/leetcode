package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S66PlusOneTest {

    private S66PlusOne plusOne = new S66PlusOne();

    @Test
    public void test1() {
        int[] digits = plusOne.plusOne(new int[] { 1, 2, 3 });
        assertArrayEquals(new int[] { 1, 2, 4 }, digits);
    }

    @Test
    public void test2() {
        int[] digits = plusOne.plusOne(new int[] { 4, 3, 2, 1 });
        assertArrayEquals(new int[] { 4, 3, 2, 2 }, digits);
    }

    @Test
    public void test3() {
        int[] digits = plusOne.plusOne(new int[] { 9, 9, 9 });
        assertArrayEquals(new int[] { 1, 0, 0, 0 }, digits);
    }

    @Test
    public void test4() {
        int[] digits = plusOne.plusOne(new int[] {8, 9, 9, 9 });
        assertArrayEquals(new int[] { 9, 0, 0, 0 }, digits);
    }

}
