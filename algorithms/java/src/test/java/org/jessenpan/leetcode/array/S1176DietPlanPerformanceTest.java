package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1176DietPlanPerformanceTest {

    private S1176DietPlanPerformance dietPlanPerformance = new S1176DietPlanPerformance();

    @Test
    public void test1() {
        int d = dietPlanPerformance.dietPlanPerformance(new int[] { 1, 2, 3, 4, 5 }, 1, 3, 3);
        Assert.assertEquals(0, d);
    }

    @Test
    public void test2() {
        int d = dietPlanPerformance.dietPlanPerformance(new int[] { 3, 2 }, 2, 0, 1);
        Assert.assertEquals(1, d);
    }

    @Test
    public void test3() {
        int d = dietPlanPerformance.dietPlanPerformance(new int[] { 6, 5, 0, 0 }, 2, 1, 5);
        Assert.assertEquals(0, d);
    }

}
