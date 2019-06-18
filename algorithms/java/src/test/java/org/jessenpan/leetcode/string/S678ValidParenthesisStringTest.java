package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 * tag:string
 */
public class S678ValidParenthesisStringTest {

    private S678ValidParenthesisString validParenthesisString = new S678ValidParenthesisString();

    @Test
    public void test1() {
        boolean isValid = validParenthesisString.checkValidString("()");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test2() {
        boolean isValid = validParenthesisString.checkValidString("(*)");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test3() {
        boolean isValid = validParenthesisString.checkValidString("(*))");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test4() {
        boolean isValid = validParenthesisString.checkValidString("(((******))");
        Assert.assertTrue(isValid);
    }

    @Test
    public void test5() {
        boolean isValid = validParenthesisString.checkValidString(")(");
        Assert.assertFalse(isValid);
    }

    @Test
    public void test6() {
        boolean isValid = validParenthesisString.checkValidString("(");
        Assert.assertFalse(isValid);
    }

    @Test
    public void test7() {
        boolean isValid = validParenthesisString.checkValidString(")");
        Assert.assertFalse(isValid);
    }

    
    @Test
    public void test8() {
        boolean isValid = validParenthesisString.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
        Assert.assertFalse(isValid);
    }
    
    

}
