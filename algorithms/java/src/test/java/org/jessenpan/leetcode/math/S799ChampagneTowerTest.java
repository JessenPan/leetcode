package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S799ChampagneTowerTest {

    private S799ChampagneTower champagneTower = new S799ChampagneTower();

    @Test
    public void test1() {
        double rate = champagneTower.champagneTower(1, 1, 1);
        Assert.assertEquals(0.0, rate,0);
    }
    
    @Test
    public void test2(){
        double rate = champagneTower.champagneTower(2, 1, 1);
        Assert.assertEquals(0.5,rate,0);
    }

}
