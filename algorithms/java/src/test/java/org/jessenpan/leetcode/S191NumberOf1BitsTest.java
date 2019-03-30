package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S191NumberOf1BitsTest {

    private S191NumberOf1Bits numberOf1Bits = new S191NumberOf1Bits();

    @Test
    public void test0() {
        int n = -2;
        System.out.println(n >> 1);
        System.out.println(n >>> 1);
        System.out.println(-1 >> 1);
    }

    @Test
    public void test1() {
        int count = numberOf1Bits.hammingWeight(0x00000000000000000000000000001011);
        assertEquals(3, count);
    }

    @Test
    public void test2() {
        int count = numberOf1Bits.hammingWeight(0x00000000000000000000000010000000);
        assertEquals(1, count);
    }

    @Test
    public void test3() {
        int count = numberOf1Bits.hammingWeight(-3);
        assertEquals(31, count);
    }


    

}
