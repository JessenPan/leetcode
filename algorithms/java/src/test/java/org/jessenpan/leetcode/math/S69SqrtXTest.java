package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S69SqrtXTest {

    private S69SqrtX sqrtX = new S69SqrtX();

    @Test
    public void test() {
        int sqrt = sqrtX.mySqrt(4);
        assertEquals(2, sqrt);
    }

    @Test
    public void test1() {
        int sqrt = sqrtX.mySqrt(8);
        assertEquals(2, sqrt);
    }

    @Test
    public void test2() {
        int sqrt = sqrtX.mySqrt(10);
        assertEquals(3, sqrt);
    }

    @Test
    public void test3() {
        int sqrt = sqrtX.mySqrt(5);
        assertEquals(2, sqrt);
    }

    @Test
    public void test4() {
        int sqrt = sqrtX.mySqrt(808909662);
        System.out.println(sqrt);
        System.out.println(Math.sqrt(808909662));
    }

}
