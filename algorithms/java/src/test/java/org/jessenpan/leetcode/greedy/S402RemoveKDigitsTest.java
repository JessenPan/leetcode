package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S402RemoveKDigitsTest {

    private S402RemoveKDigits removeKDigits = new S402RemoveKDigits();

    @Test
    public void test1() {
        String digit = removeKDigits.removeKdigits("1432219", 3);
        Assert.assertEquals("1219", digit);
    }

    @Test
    public void test2() {
        String digit = removeKDigits.removeKdigits("10200", 1);
        Assert.assertEquals("200", digit);
    }

    @Test
    public void test3() {
        String digit = removeKDigits.removeKdigits("10", 2);
        Assert.assertEquals("0", digit);
    }

}
