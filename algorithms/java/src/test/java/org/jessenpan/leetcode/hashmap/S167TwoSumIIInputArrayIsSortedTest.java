package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S167TwoSumIIInputArrayIsSortedTest {

    private S167TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new S167TwoSumIIInputArrayIsSorted();

    @Test
    public void test1() {
        int[] array = twoSumIIInputArrayIsSorted.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(new int[] { 1, 2 }, array);
    }

    @Test
    public void test2() {
        int[] array = twoSumIIInputArrayIsSorted.twoSum(new int[] {-1,0 }, -1);
        assertArrayEquals(new int[] { 1, 2 }, array);
    }
}
