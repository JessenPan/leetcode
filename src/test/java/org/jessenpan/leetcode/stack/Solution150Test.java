package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @since 2019/2/27 22:55
 */
public class Solution150Test {

    private final Solution150 solution150 = new Solution150();

    @Test
    public void test1() {
        assertEquals(9, solution150.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
    }

    @Test
    public void test2() {
        assertEquals(6, solution150.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
    }

    @Test
    public void test3() {
        assertEquals(22, solution150.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
    }

}
