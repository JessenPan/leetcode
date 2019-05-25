package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 * @date 2019-05-25 09:39
 */
public class S11ContainerWithMostWaterTest {

    private S11ContainerWithMostWater containerWithMostWater = new S11ContainerWithMostWater();

    @Test
    public void test1() {
        int maxArea = containerWithMostWater.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
        Assert.assertEquals(49,maxArea);
    }
    
    @Test
    public void test2(){
        int maxArea = containerWithMostWater.maxArea(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        Assert.assertEquals(16,maxArea);
    }

}
