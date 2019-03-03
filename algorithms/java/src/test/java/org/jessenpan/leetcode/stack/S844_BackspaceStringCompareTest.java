package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 * @since 2019/2/25 23:30
 */
public class S844_BackspaceStringCompareTest {

    private S844_BackspaceStringCompare s844BackspaceStringCompare = new S844_BackspaceStringCompare();

    @Test
    public void test1() {
        assertTrue(s844BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
    }


    @Test
    public void test2() {
        assertTrue(s844BackspaceStringCompare.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertTrue(s844BackspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test4() {
        assertFalse(s844BackspaceStringCompare.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test5() {
        assertTrue(s844BackspaceStringCompare.backspaceCompare("y#fo##f", "y#f#o##f"));
    }

}
