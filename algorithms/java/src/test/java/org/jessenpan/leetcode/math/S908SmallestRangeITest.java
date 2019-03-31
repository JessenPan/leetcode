package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S908SmallestRangeITest {

    private S908SmallestRangeI smallestRangeI = new S908SmallestRangeI();
    
    @Test
    public void test1(){
        int distance= smallestRangeI.smallestRangeI(new int[]{1},0);
        assertEquals(0,distance);
    }

    @Test
    public void test2(){
        int distance= smallestRangeI.smallestRangeI(new int[]{0,10},2);
        assertEquals(6,distance);
    }

    @Test
    public void test3(){
        int distance= smallestRangeI.smallestRangeI(new int[]{1,3,6},3);
        assertEquals(0,distance);
    }
    
}
