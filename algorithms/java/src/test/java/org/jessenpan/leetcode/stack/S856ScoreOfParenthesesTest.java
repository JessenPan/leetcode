package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S856ScoreOfParenthesesTest {

    private S856ScoreOfParentheses s856ScoreOfParentheses = new S856ScoreOfParentheses();

    @Test
    public void test1() {
        int result = s856ScoreOfParentheses.scoreOfParentheses("()");
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = s856ScoreOfParentheses.scoreOfParentheses("(())");
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = s856ScoreOfParentheses.scoreOfParentheses("()()");
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        int result = s856ScoreOfParentheses.scoreOfParentheses("(()(()))");
        assertEquals(6, result);
    }
}
