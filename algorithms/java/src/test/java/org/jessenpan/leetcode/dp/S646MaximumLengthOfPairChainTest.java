package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S646MaximumLengthOfPairChainTest {

    private S646MaximumLengthOfPairChain maximumLengthOfPairChain = new S646MaximumLengthOfPairChain();

    @Test
    public void test1() {
        int n = maximumLengthOfPairChain.findLongestChain(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } });
        Assert.assertEquals(2, n);
    }

    @Test
    public void test2() {
        int n = maximumLengthOfPairChain.findLongestChain(new int[][] { { 9, 10 }, { 6, 7 }, { 9, 11 }, { 5, 9 } });
        Assert.assertEquals(2, n);
    }

    @Test
    public void test3() {
        int n = maximumLengthOfPairChain.findLongestChain(new int[][] { { -1, 1 }, { -2, 7 }, { -5, 8 }, { -3, 8 }, { 1, 3 }, { -2, 9 }, { -5, 2 } });
        Assert.assertEquals(1, n);
    }

}
