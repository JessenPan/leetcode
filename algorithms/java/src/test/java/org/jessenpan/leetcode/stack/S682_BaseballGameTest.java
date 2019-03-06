package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S682_BaseballGameTest {

    private S682_BaseballGame s682BaseballGame = new S682_BaseballGame();

    @Test
    public void test1() {
        String[] args = { "5", "2", "C", "D", "+" };
        int calResult = s682BaseballGame.calPoints(args);
        assertEquals(30, calResult);
    }

    @Test
    public void test2() {
        String[] args = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        int calResult = s682BaseballGame.calPoints(args);
        assertEquals(27,calResult);
    }
}
