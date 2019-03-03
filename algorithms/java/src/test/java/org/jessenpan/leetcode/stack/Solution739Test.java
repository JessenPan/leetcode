package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 * @since 2019/3/2 22:03
 */
public class Solution739Test {

    private Solution739 solution739 = new Solution739();

    @Test
    public void test1() {

        int[] result = solution739.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
        assertArrayEquals(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 }, result);
    }

    @Test
    public void test2() {
        int[] result = solution739.dailyTemperatures(new int[] { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 });
        assertArrayEquals(new int[] { 8, 1, 5, 4, 3, 2, 1, 1, 0, 0 }, result);
    }
}
