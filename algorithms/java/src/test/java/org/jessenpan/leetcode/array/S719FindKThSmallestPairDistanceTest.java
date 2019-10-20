package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S719FindKThSmallestPairDistanceTest {

    private S719FindKThSmallestPairDistance findKThSmallestPairDistance = new S719FindKThSmallestPairDistance();

    @Test
    public void test1() {
        int v = findKThSmallestPairDistance.smallestDistancePair(new int[] { 1, 3, 1 }, 1);
        Assert.assertEquals(0, v);
    }

}
