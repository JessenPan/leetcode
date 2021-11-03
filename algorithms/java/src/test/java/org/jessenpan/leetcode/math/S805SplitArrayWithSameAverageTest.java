package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S805SplitArrayWithSameAverageTest {

    private S805SplitArrayWithSameAverage splitArrayWithSameAverage = new S805SplitArrayWithSameAverage();

    @Test
    public void test1() {
        boolean valid = splitArrayWithSameAverage.splitArraySameAverage(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        Assert.assertTrue(valid);
    }

}
