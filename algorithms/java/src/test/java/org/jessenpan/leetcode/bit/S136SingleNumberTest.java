package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S136SingleNumberTest {

    private S136SingleNumber singleNumber = new S136SingleNumber();

    @Test
    public void test1() {
        int theSingleNumber = singleNumber.singleNumber(new int[] { 2, 2, 1 });
        assertEquals(1, theSingleNumber);
    }

    @Test
    public void test2() {
        int theSingleNumber = singleNumber.singleNumber(new int[] { 4, 1, 2, 2, 1 });
        assertEquals(4, theSingleNumber);
    }

}
