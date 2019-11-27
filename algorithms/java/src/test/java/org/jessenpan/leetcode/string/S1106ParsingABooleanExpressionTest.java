package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1106ParsingABooleanExpressionTest {

    private S1106ParsingABooleanExpression parsingABooleanExpression = new S1106ParsingABooleanExpression();

    @Test
    public void test1() {
        boolean rs = parsingABooleanExpression.parseBoolExpr("!(f)");
        Assert.assertTrue(rs);
    }

    @Test
    public void test2() {
        boolean rs = parsingABooleanExpression.parseBoolExpr("|(f,t)");
        Assert.assertTrue(rs);
    }

    @Test
    public void test3() {
        boolean rs = parsingABooleanExpression.parseBoolExpr("&(f,t)");
        Assert.assertFalse(rs);
    }

    @Test
    public void test4() {
        boolean rs = parsingABooleanExpression.parseBoolExpr("|(&(t,f,t),!(t))");
        Assert.assertFalse(rs);
    }

    @Test
    public void test5() {
        boolean rs = parsingABooleanExpression.parseBoolExpr("&(t,t,t)");
        Assert.assertTrue(rs);
    }

}
