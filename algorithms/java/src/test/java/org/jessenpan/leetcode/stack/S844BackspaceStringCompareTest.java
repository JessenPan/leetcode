package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S844BackspaceStringCompareTest {

    private S844BackspaceStringCompare s844BackspaceStringCompare = new S844BackspaceStringCompare();

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
