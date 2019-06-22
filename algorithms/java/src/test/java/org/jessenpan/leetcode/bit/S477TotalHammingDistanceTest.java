package org.jessenpan.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S477TotalHammingDistanceTest {

    private S477TotalHammingDistance totalHammingDistance = new S477TotalHammingDistance();
    
    @Test
    public void test1(){
        int total = totalHammingDistance.totalHammingDistance(new int[] { 4, 14, 2 });
        Assert.assertEquals(6, total);
    }

}
