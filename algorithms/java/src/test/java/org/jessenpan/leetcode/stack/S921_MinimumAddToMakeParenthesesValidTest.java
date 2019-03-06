package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S921_MinimumAddToMakeParenthesesValidTest {

    private S921_MinimumAddToMakeParenthesesValid s921MinimumAddToMakeParenthesesValid = new S921_MinimumAddToMakeParenthesesValid();

    @Test
    public void test1() {
        assertEquals(1, s921MinimumAddToMakeParenthesesValid.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, s921MinimumAddToMakeParenthesesValid.minAddToMakeValid("((("));
    }

    @Test
    public void test3() {
        assertEquals(0, s921MinimumAddToMakeParenthesesValid.minAddToMakeValid("()"));
    }

    @Test
    public void test4() {
        assertEquals(4, s921MinimumAddToMakeParenthesesValid.minAddToMakeValid("()))(("));
    }

}
