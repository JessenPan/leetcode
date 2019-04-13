package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S645SetMismatchTest {

    private S645SetMismatch setMismatch = new S645SetMismatch();

    @Test
    public void test1() {
        int[] errorNums = setMismatch.findErrorNums(new int[] { 1, 2, 2, 4 });
        assertArrayEquals(new int[] { 2, 3 }, errorNums);
    }

    @Test
    public void test2() {
        int[] errorNums = setMismatch.findErrorNums(new int[] { 2, 2 });
        assertArrayEquals(new int[] { 2,1 }, errorNums);
    }

    @Test
    public void test3() {
        int[] errorNums = setMismatch.findErrorNums(new int[] { 1,1 });
        assertArrayEquals(new int[] { 1,2 }, errorNums);
    }

}
