package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S852PeakIndexInAMountainArrayTest {

    private S852PeakIndexInAMountainArray peakIndexInAMountainArray = new S852PeakIndexInAMountainArray();
    
    @Test
    public void test1(){
        int index = peakIndexInAMountainArray.peakIndexInMountainArray(new int[] { 0, 1, 0 });
        assertEquals(1,index);
    }

    @Test
    public void test2(){
        int index = peakIndexInAMountainArray.peakIndexInMountainArray(new int[] { 0, 2,1,0 });
        assertEquals(1,index);
    }
    
}
