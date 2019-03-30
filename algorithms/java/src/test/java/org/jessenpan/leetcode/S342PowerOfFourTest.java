package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S342PowerOfFourTest {

    private S342PowerOfFour powerOfFour = new S342PowerOfFour();
    
    @Test
    public void test(){
        boolean isPowerOfFour = powerOfFour.isPowerOfFour(16);
        assertTrue(isPowerOfFour);
    }

    @Test
    public void test1(){
        boolean isPowerOfFour = powerOfFour.isPowerOfFour(5);
        assertFalse(isPowerOfFour);
    }

    @Test
    public void test2(){
        boolean isPowerOfFour = powerOfFour.isPowerOfFour(2);
        assertFalse(isPowerOfFour);
    }
}
