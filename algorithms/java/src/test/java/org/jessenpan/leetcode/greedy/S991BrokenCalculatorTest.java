package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S991BrokenCalculatorTest {

    private S991BrokenCalculator brokenCalculator = new S991BrokenCalculator();

    @Test
    public void test1() {
        int times = brokenCalculator.brokenCalc(2, 3);
        Assert.assertEquals(2, times);
    }

    @Test
    public void test2() {
        int times = brokenCalculator.brokenCalc(5, 8);
        Assert.assertEquals(2, times);
    }

    @Test
    public void test3() {
        int times = brokenCalculator.brokenCalc(3, 10);
        Assert.assertEquals(3, times);
    }

    @Test
    public void test4() {
        int times = brokenCalculator.brokenCalc(1024, 1);
        Assert.assertEquals(1023, times);
    }

    @Test
    public void test5() {
        int times = brokenCalculator.brokenCalc(1, 1000000000);
        Assert.assertEquals(39, times);
    }

}
