package org.jessenpan.leetcode.array;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S661ImageSmootherTest {

    private S661ImageSmoother imageSmoother = new S661ImageSmoother();
    
    @Test
    public void test1(){
        imageSmoother.imageSmoother(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } });
    }
    
}
