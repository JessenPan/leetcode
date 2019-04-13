package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S88MergeSortedArrayTest {

    private S88MergeSortedArray mergeSortedArray = new S88MergeSortedArray();

    @Test
    public void test1() {
        int[] origin = new int[] { 1, 2, 3, 0, 0, 0 };
        mergeSortedArray.merge(origin, 3, new int[] { 2, 5, 6 }, 3);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, origin);
    }

}
