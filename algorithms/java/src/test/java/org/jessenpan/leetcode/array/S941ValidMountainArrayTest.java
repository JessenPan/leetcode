package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jessenpan
 */
public class S941ValidMountainArrayTest {

    private S941ValidMountainArray validMountainArray = new S941ValidMountainArray();

    @Test
    public void test1() {
        boolean isValid = validMountainArray.validMountainArray(new int[] { 2, 1 });
        assertFalse(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = validMountainArray.validMountainArray(new int[] { 3, 5, 5 });
        assertFalse(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = validMountainArray.validMountainArray(new int[] { 0, 3, 2, 1 });
        assertTrue(isValid);
    }

    @Test
    public void test4() {
        boolean isValid = validMountainArray.validMountainArray(new int[] { 1, 2, 3, 4 });
        assertFalse(isValid);
    }

}
