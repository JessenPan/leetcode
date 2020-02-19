package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S365WaterAndJugProblemTest {

    private S365WaterAndJugProblem waterAndJugProblem = new S365WaterAndJugProblem();

    @Test
    public void test1() {
        boolean valid = waterAndJugProblem.canMeasureWater(3, 5, 4);
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = waterAndJugProblem.canMeasureWater(2, 6, 5);
        Assert.assertFalse(valid);
    }

    @Test
    public void test3() {
        boolean valid = waterAndJugProblem.canMeasureWater(0, 0, 1);
        Assert.assertFalse(valid);
    }

    @Test
    public void test4() {
        boolean valid = waterAndJugProblem.canMeasureWater(0, 2, 1);
        Assert.assertFalse(valid);
    }

    @Test
    public void test5() {
        boolean valid = waterAndJugProblem.canMeasureWater(34, 5, 6);
        Assert.assertTrue(valid);
    }

    @Test
    public void test6() {
        boolean valid = waterAndJugProblem.canMeasureWater(1,1,12);
        Assert.assertFalse(valid);
    }

}
