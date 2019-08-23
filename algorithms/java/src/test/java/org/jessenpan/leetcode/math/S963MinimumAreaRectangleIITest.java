package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S963MinimumAreaRectangleIITest {

    private S963MinimumAreaRectangleII minimumAreaRectangleII = new S963MinimumAreaRectangleII();
    
    @Test
    public void test1(){
       double d= minimumAreaRectangleII.minAreaFreeRect(new int[][]{{1,2},{2,1},{1,0},{0,1}});
        Assert.assertEquals(2.00000,d,0);
    }

    @Test
    public void test2(){
        double d= minimumAreaRectangleII.minAreaFreeRect(new int[][]{{0,1},{2,1},{1,1},{1,0},{2,0}});
        Assert.assertEquals(1.00000,d,0);
    }


    @Test
    public void test3(){
        double d= minimumAreaRectangleII.minAreaFreeRect(new int[][]{{0,3},{1,2},{3,1},{1,3},{2,1}});
        Assert.assertEquals(1.00000,d,0);
    }


    @Test
    public void test4(){
        double d= minimumAreaRectangleII.minAreaFreeRect(new int[][]{{3,1},{1,1},{0,1},{2,1},{3,3},{3,2},{0,2}});
        Assert.assertEquals(1.00000,d,0);
    }

}
