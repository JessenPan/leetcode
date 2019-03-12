package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S575DistributeCandiesTest {

    private S575DistributeCandies distributeCandies = new S575DistributeCandies();
    
    @Test
    public void test1(){
       int candyType= distributeCandies.distributeCandies(new int[] { 1, 1, 2, 2, 3, 3 });
        assertEquals(3, candyType);
    }

    @Test
    public void test2(){
        int candyType= distributeCandies.distributeCandies(new int[] { 1, 1, 2, 3 });
        assertEquals(2, candyType);
    }
}
