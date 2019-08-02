package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1029TwoCitySchedulingTest {

    private S1029TwoCityScheduling twoCityScheduling = new S1029TwoCityScheduling();

    @Test
    public void test1() {
        int cost = twoCityScheduling.twoCitySchedCost(new int[][] { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } });
        Assert.assertEquals(110, cost);
    }

    @Test
    public void test2() {
        int cost = twoCityScheduling.twoCitySchedCost(new int[][] { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } });
        Assert.assertEquals(1859, cost);
    }

}
