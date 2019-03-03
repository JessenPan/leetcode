package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @since 2019/3/3 10:23
 */
public class S856_ScoreOfParenthesesTest {

    private S856_ScoreOfParentheses s856ScoreOfParentheses = new S856_ScoreOfParentheses();

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
