package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S509FibonacciNumberTest {

    private S509FibonacciNumber fibonacciNumber = new S509FibonacciNumber();

    @Test
    public void test1() {
        int result = fibonacciNumber.fib(2);
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = fibonacciNumber.fib(3);
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = fibonacciNumber.fib(4);
        assertEquals(3, result);
    }

}
