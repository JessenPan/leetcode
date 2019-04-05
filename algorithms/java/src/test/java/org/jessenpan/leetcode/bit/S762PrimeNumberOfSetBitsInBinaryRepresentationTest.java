package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S762PrimeNumberOfSetBitsInBinaryRepresentationTest {

    private S762PrimeNumberOfSetBitsInBinaryRepresentation primeNumberOfSetBitsInBinaryRepresentation = new S762PrimeNumberOfSetBitsInBinaryRepresentation();
    
    @Test
    public void test1(){
        int num = primeNumberOfSetBitsInBinaryRepresentation.countPrimeSetBits(6, 10);
        assertEquals(4, num);
    }

    @Test
    public void test2(){
        int num = primeNumberOfSetBitsInBinaryRepresentation.countPrimeSetBits(10, 15);
        assertEquals(5, num);
    }
    
}
