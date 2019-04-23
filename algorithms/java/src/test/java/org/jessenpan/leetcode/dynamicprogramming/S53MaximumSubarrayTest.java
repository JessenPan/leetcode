package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S53MaximumSubarrayTest {

    private S53MaximumSubarray maximumSubarray = new S53MaximumSubarray();

    @Test
    public void test1() {
        int largest = maximumSubarray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        assertEquals(6, largest);
    }

    @Test
    public void test2() {
        int largest = maximumSubarray.maxSubArray(new int[] { -2, 1 });
        assertEquals(1, largest);
    }

    @Test
    public void test3() {
        int largest = maximumSubarray.maxSubArray(new int[] { -2, -1 });
        assertEquals(-1, largest);
    }

    @Test
    public void test4() {
        int largest = maximumSubarray.maxSubArray(new int[] { 8, -19, 5, -4, 20 });
        assertEquals(21, largest);
    }

}
