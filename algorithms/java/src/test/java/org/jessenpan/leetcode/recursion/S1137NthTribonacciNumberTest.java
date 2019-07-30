package org.jessenpan.leetcode.recursion;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1137NthTribonacciNumberTest {

    private S1137NthTribonacciNumber nthTribonacciNumber = new S1137NthTribonacciNumber();

    @Test
    public void test1() {
        int val = nthTribonacciNumber.tribonacci(4);
        Assert.assertEquals(4, val);
    }

    @Test
    public void test2() {
        int val = nthTribonacciNumber.tribonacci(25);
        Assert.assertEquals(1389537, val);
    }

    @Test
    public void test3() {
        int val = nthTribonacciNumber.tribonacci(37);
        System.out.println(val);
    }

}
