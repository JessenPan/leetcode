package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S190ReverseBitsTest {

    private S190ReverseBits reverseBits = new S190ReverseBits();

    @Test
    public void test1() {
        int reversed = reverseBits.reverseBits(43261596);
        assertEquals(964176192, reversed);
    }

    @Test
    public void test2() {
        int reversed = reverseBits.reverseBits(-3);
        assertEquals(-1073741825, reversed);
    }

}
