package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1014BestSightseeingPairTest {

    private S1014BestSightseeingPair bestSightseeingPair = new S1014BestSightseeingPair();

    @Test
    public void test1() {
        int max = bestSightseeingPair.maxScoreSightseeingPair(new int[] { 8, 1, 5, 2, 6 });
        Assert.assertEquals(11, max);
    }

}
