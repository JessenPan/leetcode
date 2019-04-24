package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S172FactorialTrailingZeroesTest {

    private S172FactorialTrailingZeroes factorialTrailingZeroes = new S172FactorialTrailingZeroes();

    @Test
    public void test1() {
        int count = factorialTrailingZeroes.trailingZeroes(3);
        assertEquals(0, count);
    }

    @Test
    public void test2() {
        int count = factorialTrailingZeroes.trailingZeroes(5);
        assertEquals(1, count);
    }

    @Test
    public void test3() {
        int count = factorialTrailingZeroes.trailingZeroes(15);
        assertEquals(3, count);
    }

}
