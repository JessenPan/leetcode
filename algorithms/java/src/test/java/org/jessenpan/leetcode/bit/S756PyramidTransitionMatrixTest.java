package org.jessenpan.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S756PyramidTransitionMatrixTest {

    private S756PyramidTransitionMatrix pyramidTransitionMatrix = new S756PyramidTransitionMatrix();
    
    @Test
    public void test1(){
        boolean canTrans = pyramidTransitionMatrix.pyramidTransition("XYZ", Arrays.asList("XYD", "YZE", "DEA", "FFF"));
        Assert.assertTrue(canTrans);
    }

    @Test
    public void test2(){
        boolean canTrans = pyramidTransitionMatrix.pyramidTransition("XXYX", Arrays.asList("XXX", "XXY", "XYX", "XYY", "YXZ"));
        Assert.assertFalse(canTrans);
    }
    
}
