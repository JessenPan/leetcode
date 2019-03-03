package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @since 2019/2/24 23:09
 */
public class Solution682Test {

    private Solution682 solution682 = new Solution682();

    @Test
    public void test1() {
        String[] args = { "5", "2", "C", "D", "+" };
        int calResult = solution682.calPoints(args);
        assertEquals(30, calResult);
    }

    @Test
    public void test2() {
        String[] args = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        int calResult = solution682.calPoints(args);
        assertEquals(27,calResult);
    }
}
