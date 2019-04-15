package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S754ReachANumberTest {

    private S754ReachANumber reachANumber = new S754ReachANumber();

    @Test
    public void test1() {
        int times = reachANumber.reachNumber(3);
        assertEquals(2, times);
    }

    @Test
    public void test2() {
        int times = reachANumber.reachNumber(2);
        assertEquals(3, times);
    }

    @Test
    public void test3() {
        int times = reachANumber.reachNumber(2);
        assertEquals(3, times);
    }

    @Test
    public void test4() {
        int times = reachANumber.reachNumber(-2);
        assertEquals(3, times);
    }

}
