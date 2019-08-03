package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1090LargestValuesFromLabelsTest {

    private S1090LargestValuesFromLabels largestValuesFromLabels = new S1090LargestValuesFromLabels();

    @Test
    public void test1() {
        int val = largestValuesFromLabels.largestValsFromLabels(new int[] { 5, 4, 3, 2, 1 }, new int[] { 1, 1, 2, 2, 3 }, 3, 1);
        Assert.assertEquals(9, val);
    }

    @Test
    public void test2() {
        int val = largestValuesFromLabels.largestValsFromLabels(new int[] { 5,4,3,2,1 }, new int[] { 1,3,3,3,2}, 3, 2);
        Assert.assertEquals(12, val);
    }

    @Test
    public void test3() {
        int val = largestValuesFromLabels.largestValsFromLabels(new int[] { 9,8,8,7,6 }, new int[] { 0,0,0,1,1}, 3, 1);
        Assert.assertEquals(16, val);
    }

    @Test
    public void test4() {
        int val = largestValuesFromLabels.largestValsFromLabels(new int[] { 9,8,8,7,6 }, new int[] { 0,0,0,1,1}, 3, 2);
        Assert.assertEquals(24, val);
    }

}
