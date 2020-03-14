package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S224BasicCalculatorTest {

    private S224BasicCalculator basicCalculator = new S224BasicCalculator();

    @Test
    public void test1() {
        int rs = basicCalculator.calculate("1 + 1");
        Assert.assertEquals(2, rs);
    }


    @Test
    public void test2() {
        int rs = basicCalculator.calculate("2-1 + 2 ");
        Assert.assertEquals(3, rs);
    }

    @Test
    public void test3() {
        int rs = basicCalculator.calculate("(1+(4+5+2)-3)+(6+8)");
        Assert.assertEquals(23, rs);
    }

}
