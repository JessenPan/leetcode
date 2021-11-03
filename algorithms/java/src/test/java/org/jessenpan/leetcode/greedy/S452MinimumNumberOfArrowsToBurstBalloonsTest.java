package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S452MinimumNumberOfArrowsToBurstBalloonsTest {

    private S452MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new S452MinimumNumberOfArrowsToBurstBalloons();

    @Test
    public void test1() {
        int t = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } });
        Assert.assertEquals(2, t);
    }

}
