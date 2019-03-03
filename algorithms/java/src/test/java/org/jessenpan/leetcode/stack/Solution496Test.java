package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 * @since 2019/2/25 23:08
 */
public class Solution496Test {

    private Solution496 solution496 = new Solution496();

    @Test
    public void test1() {
        int[] result = solution496.nextGreaterElement(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 });
        assertArrayEquals(new int[] { -1, 3, -1 }, result);
    }

    @Test
    public void test2() {
        int[] result = solution496.nextGreaterElement(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 });
        assertArrayEquals(new int[] { 3, -1 }, result);
    }

}
