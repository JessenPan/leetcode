package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S868BinaryGapTest {

    private S868BinaryGap binaryGap = new S868BinaryGap();

    @Test
    public void test1() {
       int distance= binaryGap.binaryGap(22);
        assertEquals(2,distance);
    }

    @Test
    public void test2() {
        int distance= binaryGap.binaryGap(5);
        assertEquals(2,distance);
    }

    @Test
    public void test3() {
        int distance= binaryGap.binaryGap(6);
        assertEquals(1,distance);
    }

    @Test
    public void test4() {
        int distance= binaryGap.binaryGap(8);
        assertEquals(0,distance);
    }

}
