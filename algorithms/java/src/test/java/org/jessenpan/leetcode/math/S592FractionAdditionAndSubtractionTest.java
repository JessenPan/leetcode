package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S592FractionAdditionAndSubtractionTest {

    private S592FractionAdditionAndSubtraction fractionAdditionAndSubtraction = new S592FractionAdditionAndSubtraction();

    @Test
    public void test1() {
        String str = fractionAdditionAndSubtraction.fractionAddition("-1/2+1/2");
        Assert.assertEquals("0/1", str);
    }

    @Test
    public void test2() {
        String str = fractionAdditionAndSubtraction.fractionAddition("-1/2+1/2+1/3");
        Assert.assertEquals("1/3", str);
    }

    @Test
    public void test3() {
        String str = fractionAdditionAndSubtraction.fractionAddition("1/3-1/2");
        Assert.assertEquals("-1/6", str);
    }

    @Test
    public void test4() {
        String str = fractionAdditionAndSubtraction.fractionAddition("5/3+1/3");
        Assert.assertEquals("2/1", str);
    }

}
