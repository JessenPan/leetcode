package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @since 2019/2/27 22:17
 */
public class Solution921Test {

    private Solution921 solution921 = new Solution921();

    @Test
    public void test1() {
        assertEquals(1, solution921.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution921.minAddToMakeValid("((("));
    }

    @Test
    public void test3() {
        assertEquals(0, solution921.minAddToMakeValid("()"));
    }

    @Test
    public void test4() {
        assertEquals(4, solution921.minAddToMakeValid("()))(("));
    }

}
