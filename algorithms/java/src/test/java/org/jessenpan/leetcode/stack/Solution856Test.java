package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @since 2019/3/3 10:23
 */
public class Solution856Test {

    private Solution856 solution856 = new Solution856();

    @Test
    public void test1() {
        int result = solution856.scoreOfParentheses("()");
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = solution856.scoreOfParentheses("(())");
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = solution856.scoreOfParentheses("()()");
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        int result = solution856.scoreOfParentheses("(()(()))");
        assertEquals(6, result);
    }
}
