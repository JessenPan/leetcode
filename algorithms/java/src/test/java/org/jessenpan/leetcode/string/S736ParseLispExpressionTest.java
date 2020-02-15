package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S736ParseLispExpressionTest {

    private S736ParseLispExpression parseLispExpression = new S736ParseLispExpression();

    @Test
    public void test1() {
        int t = parseLispExpression.evaluate("(add 1 2)");
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = parseLispExpression.evaluate("(mult 3 (add 2 3))");
        Assert.assertEquals(15, t);
    }

    @Test
    public void test3() {
        int t = parseLispExpression.evaluate("(let x 2 (mult x 5))");
        Assert.assertEquals(10, t);
    }

    @Test
    public void test4() {
        int t = parseLispExpression.evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))");
        Assert.assertEquals(14, t);
    }

    @Test
    public void test5() {
        int t = parseLispExpression.evaluate("(let x 3 x 2 x)");
        Assert.assertEquals(2, t);
    }

    @Test
    public void test6() {
        int t = parseLispExpression.evaluate("(let x 1 y 2 x (add x y) (add x y))");
        Assert.assertEquals(5, t);
    }

    @Test
    public void test7() {
        int t = parseLispExpression.evaluate("(let x 2 (add (let x 3 (let x 4 x)) x))");
        Assert.assertEquals(6, t);
    }

    @Test
    public void test8() {
        int t = parseLispExpression.evaluate(" (let a1 3 b2 (add a1 1) b2) ");
        Assert.assertEquals(4, t);
    }

}
