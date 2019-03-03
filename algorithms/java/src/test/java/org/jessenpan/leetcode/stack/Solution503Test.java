package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 * @since 2019/3/3 22:26
 */
public class Solution503Test {

    private Solution503 solution503 = new Solution503();

    @Test
    public void test1() {
        int[] result = solution503.nextGreaterElements(new int[] { 1, 2, 1 });
        assertArrayEquals(new int[] { 2, -1, 2 }, result);
    }

}
