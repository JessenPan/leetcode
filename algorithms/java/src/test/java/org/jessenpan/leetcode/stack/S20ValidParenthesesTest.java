package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S20ValidParenthesesTest {

    private S20ValidParentheses validParentheses = new S20ValidParentheses();

    @Test
    public void test1() {
        boolean rs = validParentheses.isValid("()");
        Assert.assertTrue(rs);
    }



    @Test
    public void test2() {
        boolean rs = validParentheses.isValid("()[]{}");
        Assert.assertTrue(rs);
    }

    @Test
    public void test3() {
        boolean rs = validParentheses.isValid("(]");
        Assert.assertFalse(rs);
    }



    @Test
    public void test4() {
        boolean rs = validParentheses.isValid("{[]}");
        Assert.assertTrue(rs);
    }

}

