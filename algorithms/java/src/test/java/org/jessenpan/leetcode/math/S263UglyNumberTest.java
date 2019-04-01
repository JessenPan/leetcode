package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S263UglyNumberTest {

    private S263UglyNumber uglyNumber = new S263UglyNumber();

    @Test
    public void test() {
        boolean isUgly = uglyNumber.isUgly(6);
        assertTrue(isUgly);
    }

    @Test
    public void test1() {
        boolean isUgly = uglyNumber.isUgly(8);
        assertTrue(isUgly);
    }


    @Test
    public void test2() {
        boolean isUgly = uglyNumber.isUgly(14);
        assertFalse(isUgly);
    }

}
