package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S486PredictTheWinnerTest {

    private S486PredictTheWinner predictTheWinner = new S486PredictTheWinner();

    @Test
    public void test1() {
        boolean isWin = predictTheWinner.PredictTheWinner(new int[] { 1, 5, 2 });
        Assert.assertFalse(isWin);
    }

    @Test
    public void test2() {
        boolean isWin = predictTheWinner.PredictTheWinner(new int[] { 1, 5, 233,7 });
        Assert.assertTrue(isWin);
    }

}
