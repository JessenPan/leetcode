package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S857MinimumCostToHireKWorkersTest {

    private S857MinimumCostToHireKWorkers minimumCostToHireKWorkers = new S857MinimumCostToHireKWorkers();

    @Test
    public void test1() {
        double s = minimumCostToHireKWorkers.mincostToHireWorkers(new int[] { 10, 20, 5 }, new int[] { 70, 50, 30 }, 2);
        Assert.assertEquals(105, s, 0);
    }

    @Test
    public void test2() {
        double s = minimumCostToHireKWorkers.mincostToHireWorkers(new int[] { 3, 1, 10, 10, 1 }, new int[] { 4, 8, 2, 2, 7 }, 3);
        Assert.assertEquals(30.66667, s, 0);
    }

}
