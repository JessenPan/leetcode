package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.stack.S150EvaluateReversePolishNotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S150EvaluateReversePolishNotationTest {

    private final S150EvaluateReversePolishNotation s150EvaluateReversePolishNotation = new S150EvaluateReversePolishNotation();

    @Test
    public void test1() {
        assertEquals(9, s150EvaluateReversePolishNotation.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
    }

    @Test
    public void test2() {
        assertEquals(6, s150EvaluateReversePolishNotation.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
    }

    @Test
    public void test3() {
        assertEquals(22, s150EvaluateReversePolishNotation.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
    }

}
