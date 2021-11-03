package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S407TrappingRainWaterIITest {

    private S407TrappingRainWaterII trappingRainWaterII = new S407TrappingRainWaterII();

    @Test
    public void test1() {
        int t = trappingRainWaterII.trapRainWater(new int[][] { { 1, 4, 3, 1, 3, 2 }, { 3, 2, 1, 3, 2, 4 }, { 2, 3, 3, 2, 3, 1 } });
        Assert.assertEquals(4, t);
    }

}
