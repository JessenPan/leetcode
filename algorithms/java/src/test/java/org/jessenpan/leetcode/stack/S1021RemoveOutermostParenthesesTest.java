package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1021RemoveOutermostParenthesesTest {

    private S1021RemoveOutermostParentheses removeOutermostParentheses = new S1021RemoveOutermostParentheses();

    @Test
    public void test1() {
        String str = removeOutermostParentheses.removeOuterParentheses("(()())(())");
        Assert.assertEquals("()()()", str);
    }

    @Test
    public void test2() {
        String str = removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))");
        Assert.assertEquals("()()()()(())", str);
    }

    @Test
    public void test3() {
        String str = removeOutermostParentheses.removeOuterParentheses("()()");
        Assert.assertEquals("", str);
    }

}
