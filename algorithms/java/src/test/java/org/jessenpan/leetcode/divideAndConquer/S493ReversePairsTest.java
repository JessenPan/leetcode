package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S493ReversePairsTest {

    private S493ReversePairs reversePairs = new S493ReversePairs();

    @Test
    public void test1() {
        int pairs = reversePairs.reversePairs(new int[] { 1, 3, 2, 3, 1 });
        Assert.assertEquals(2, pairs);
    }

    @Test
    public void test2() {
        int pairs = reversePairs.reversePairs(new int[] { 2, 4, 3, 5, 1 });
        Assert.assertEquals(3, pairs);
    }

}
