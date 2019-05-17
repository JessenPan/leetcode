package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S357CountNumbersWithUniqueDigits;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S357CountNumbersWithUniqueDigitsTest {

    private S357CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new S357CountNumbersWithUniqueDigits();

    @Test
    public void test1() {
        int count = countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(0);
        Assert.assertEquals(1, count);
    }

    @Test
    public void test2() {
        int count = countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(1);
        Assert.assertEquals(10, count);
    }

    @Test
    public void test3() {
        int count = countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2);
        Assert.assertEquals(91, count);
    }

}
