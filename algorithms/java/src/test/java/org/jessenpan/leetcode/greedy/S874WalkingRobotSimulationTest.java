package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S874WalkingRobotSimulationTest {

    private S874WalkingRobotSimulation walkingRobotSimulation = new S874WalkingRobotSimulation();

    @Test
    public void test1() {
        int t = walkingRobotSimulation.robotSim(new int[] { 4, -1, 3 }, new int[][] {});
        Assert.assertEquals(25, t);
    }

    @Test
    public void test2() {
        int t = walkingRobotSimulation.robotSim(new int[] { 4, -1, 4, -2, 4 }, new int[][] { { 2, 4 } });
        Assert.assertEquals(65, t);
    }

}
