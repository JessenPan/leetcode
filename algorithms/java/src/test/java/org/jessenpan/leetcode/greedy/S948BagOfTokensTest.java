package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S948BagOfTokensTest {

    private S948BagOfTokens bagOfTokens = new S948BagOfTokens();

    @Test
    public void test1() {
        int v = bagOfTokens.bagOfTokensScore(new int[] { 100 }, 50);
        Assert.assertEquals(0, v);
    }

    @Test
    public void test2() {
        int v = bagOfTokens.bagOfTokensScore(new int[] { 100, 200 }, 150);
        Assert.assertEquals(1, v);
    }

    @Test
    public void test3() {
        int v = bagOfTokens.bagOfTokensScore(new int[] { 100, 200, 300, 400 }, 200);
        Assert.assertEquals(2, v);
    }

}
