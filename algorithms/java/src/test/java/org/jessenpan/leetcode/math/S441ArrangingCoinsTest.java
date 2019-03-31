package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S441ArrangingCoinsTest {

    private S441ArrangingCoins arrangingCoins = new S441ArrangingCoins();
    
    @Test
    public void test1(){
        int row = arrangingCoins.arrangeCoins(5);
        assertEquals(2,row);
    }

    @Test
    public void test2(){
        int row = arrangingCoins.arrangeCoins(8);
        assertEquals(3,row);
    }

    @Test
    public void test3(){
        int row = arrangingCoins.arrangeCoins(1804289383);
        assertEquals(60070,row);
    }
}
