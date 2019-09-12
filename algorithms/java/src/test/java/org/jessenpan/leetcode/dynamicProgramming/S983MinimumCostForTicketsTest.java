package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S983MinimumCostForTicketsTest {

    private S983MinimumCostForTickets minimumCostForTickets = new S983MinimumCostForTickets();

    @Test
    public void test1() {
        int v = minimumCostForTickets.mincostTickets(new int[] { 1, 4, 6, 7, 8, 20 }, new int[] { 2, 7, 15 });
        Assert.assertEquals(11, v);
    }

    @Test
    public void test2() {
        int v = minimumCostForTickets.mincostTickets(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31 }, new int[] { 2, 7, 15 });
        Assert.assertEquals(17, v);
    }

}
