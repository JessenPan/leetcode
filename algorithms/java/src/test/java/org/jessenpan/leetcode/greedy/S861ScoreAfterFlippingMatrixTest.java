package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S861ScoreAfterFlippingMatrixTest {

    private S861ScoreAfterFlippingMatrix scoreAfterFlippingMatrix = new S861ScoreAfterFlippingMatrix();

    @Test
    public void test1() {
        int score = scoreAfterFlippingMatrix.matrixScore(new int[][] { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } });
        Assert.assertEquals(39, score);
    }

}
