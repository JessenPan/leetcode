package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S672BulbSwitcherIITest {

    private S672BulbSwitcherII bulbSwitcherII = new S672BulbSwitcherII();
    
    @Test
    public void test1(){
       int t= bulbSwitcherII.flipLights(1, 1);
        Assert.assertEquals(2, t);
    }


    @Test
    public void test2(){
        int t= bulbSwitcherII.flipLights(2, 1);
        Assert.assertEquals(3, t);
    }

    @Test
    public void test3(){
        int t= bulbSwitcherII.flipLights(3, 1);
        Assert.assertEquals(4, t);
    }

}
