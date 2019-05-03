package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S532KDiffPairsInAnArrayTest {

    private S532KDiffPairsInAnArray kDiffPairsInAnArray = new S532KDiffPairsInAnArray();

    @Test
    public void test1() {
        int count = kDiffPairsInAnArray.findPairs(new int[] { 3, 1, 4, 1, 5 }, 2);
        Assert.assertEquals(2, count);
    }

    @Test
    public void test2() {
        int count = kDiffPairsInAnArray.findPairs(new int[] { 1, 2, 3, 4, 5 }, 1);
        Assert.assertEquals(4, count);
    }

    @Test
    public void test3() {
        int count = kDiffPairsInAnArray.findPairs(new int[] { 1, 3, 1, 5, 4 }, 0);
        Assert.assertEquals(1, count);
    }

    @Test
    public void test4() {
        int count = kDiffPairsInAnArray.findPairs(new int[] { 1,2,3,4,5 }, -1);
        Assert.assertEquals(0, count);
    }

}
