package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.math.S13RomanToInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S13RomanToIntegerTest {

    private S13RomanToInteger romanToInteger = new S13RomanToInteger();

    @Test
    public void test1() {
        int intVal = romanToInteger.romanToInt("IV");
        assertEquals(4, intVal);
    }

    @Test
    public void test2() {
        int intVal = romanToInteger.romanToInt("III");
        assertEquals(3, intVal);
    }

    @Test
    public void test3() {
        int intVal = romanToInteger.romanToInt("MCMXCIV");
        assertEquals(1994, intVal);
    }

}
