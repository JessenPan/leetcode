package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S227BasicCalculatorIITest {

    private S227BasicCalculatorII basicCalculatorII = new S227BasicCalculatorII();

    @Test
    public void test1() {
        int sum = basicCalculatorII.calculate("3+2*2");
        Assert.assertEquals(7, sum);
    }

    @Test
    public void test2() {
        int sum = basicCalculatorII.calculate("3/2");
        Assert.assertEquals(1, sum);
    }

    @Test
    public void test3() {
        int sum = basicCalculatorII.calculate("3+5 / 2");
        Assert.assertEquals(5, sum);
    }

    @Test
    public void test4() {
        int sum = basicCalculatorII.calculate("0-2147483647");
        Assert.assertEquals(-2147483647, sum);
    }

}
