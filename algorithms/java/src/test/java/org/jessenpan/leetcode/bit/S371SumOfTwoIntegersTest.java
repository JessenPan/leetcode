package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S371SumOfTwoIntegersTest {

    private S371SumOfTwoIntegers sumOfTwoIntegers = new S371SumOfTwoIntegers();
    
    @Test
    public void test1(){
        int sum = sumOfTwoIntegers.getSum(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void test2(){
        int sum = sumOfTwoIntegers.getSum(-2, 3);
        assertEquals(1, sum);
    }
    
}
