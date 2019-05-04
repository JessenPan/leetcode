package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S581ShortestUnsortedContinuousSubarrayTest {

    private S581ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new S581ShortestUnsortedContinuousSubarray();

    @Test
    public void test1() {
        int len = shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] { 2, 6, 4, 8, 10, 9, 15 });
        assertEquals(5, len);
    }

    @Test
    public void test2() {
        int len = shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] { 1, 2, 3, 4 });
        assertEquals(0, len);
    }

    @Test
    public void test3() {
        int len = shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[] { 1, 3, 2, 2 });
        assertEquals(3, len);
    }

}
