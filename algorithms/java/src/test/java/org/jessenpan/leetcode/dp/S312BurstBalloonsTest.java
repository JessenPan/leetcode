package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S312BurstBalloonsTest {

    private S312BurstBalloons burstBalloons = new S312BurstBalloons();

    @Test
    public void test1() {
        int c = burstBalloons.maxCoins(new int[] { 3, 1, 5, 8 });
        Assert.assertEquals(167, c);
    }

}
