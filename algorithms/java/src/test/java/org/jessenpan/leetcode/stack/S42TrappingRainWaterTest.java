package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S42TrappingRainWaterTest {

    private S42TrappingRainWater trappingRainWater = new S42TrappingRainWater();

    @Test
    public void test1() {
        int waters = trappingRainWater.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
        Assert.assertEquals(6, waters);
    }

}
