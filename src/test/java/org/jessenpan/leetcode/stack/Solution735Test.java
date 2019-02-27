package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 * @since 2019/2/27 23:54
 */
public class Solution735Test {

    private final Solution735 solution735 = new Solution735();

    @Test
    public void test1() {
        int[] returns = solution735.asteroidCollision(new int[] { 5, 10, -5 });
        assertArrayEquals(new int[] { 5, 10 }, returns);
    }

    @Test
    public void test2() {
        int[] returns = solution735.asteroidCollision(new int[] { 8, -8 });
        assertArrayEquals(new int[0], returns);
    }

    @Test
    public void test3() {
        int[] returns = solution735.asteroidCollision(new int[] { 10, 2, -5 });
        assertArrayEquals(new int[] { 10 }, returns);
    }

    @Test
    public void test4() {
        int[] returns = solution735.asteroidCollision(new int[] { -2, -1, 1, 2 });
        assertArrayEquals(new int[] { -2, -1, 1, 2 }, returns);
    }

    @Test
    public void test5() {
        int[] returns = solution735.asteroidCollision(new int[] { 1, -2, -2, -2 });
        assertArrayEquals(new int[] { -2, -2, -2 }, returns);
    }
}
