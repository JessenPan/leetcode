package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 * @since 2019/2/25 23:30
 */
public class Solution844Test {

    private Solution844 solution844 = new Solution844();

    @Test
    public void test1() {
        assertTrue(solution844.backspaceCompare("ab#c", "ad#c"));
    }


    @Test
    public void test2() {
        assertTrue(solution844.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertTrue(solution844.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test4() {
        assertFalse(solution844.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test5() {
        assertTrue(solution844.backspaceCompare("y#fo##f", "y#f#o##f"));
    }

}
