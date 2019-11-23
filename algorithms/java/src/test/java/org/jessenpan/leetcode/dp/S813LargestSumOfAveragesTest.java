package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S813LargestSumOfAveragesTest {

    private S813LargestSumOfAverages largestSumOfAverages = new S813LargestSumOfAverages();

    @Test
    public void test1() {
        double max = largestSumOfAverages.largestSumOfAverages(new int[] { 9, 1, 2, 3, 9 }, 3);
        Assert.assertEquals(20, max, 0);
    }

}
