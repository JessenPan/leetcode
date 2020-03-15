package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S780ReachingPoints;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S780ReachingPointsTest {

    private S780ReachingPoints reachingPoints = new S780ReachingPoints();

    @Test
    public void test1() {
        boolean valid = reachingPoints.reachingPoints(1, 1, 3, 5);
        Assert.assertTrue(valid);
    }

}
