package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S633SumOfSquareNumbersTest {

    private S633SumOfSquareNumbers sumOfSquareNumbers = new S633SumOfSquareNumbers();

    @Test
    public void test1() {
        boolean isExist = sumOfSquareNumbers.judgeSquareSum(3);
        assertFalse(isExist);
    }

    @Test
    public void test2() {
        boolean isExist = sumOfSquareNumbers.judgeSquareSum(4);
        assertTrue(isExist);
    }

}
