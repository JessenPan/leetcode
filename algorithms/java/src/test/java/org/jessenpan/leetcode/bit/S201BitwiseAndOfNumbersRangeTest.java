package org.jessenpan.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S201BitwiseAndOfNumbersRangeTest {

    private S201BitwiseAndOfNumbersRange bitwiseAndOfNumbersRange = new S201BitwiseAndOfNumbersRange();

    @Test
    public void test1() {
        int bit = bitwiseAndOfNumbersRange.rangeBitwiseAnd(5, 7);
        Assert.assertEquals(4, bit);
    }

    @Test
    public void test2() {
        int bit = bitwiseAndOfNumbersRange.rangeBitwiseAnd(0, 1);
        Assert.assertEquals(0, bit);
    }

    @Test
    public void test3() {
        int bit = bitwiseAndOfNumbersRange.rangeBitwiseAnd(7, 15);
        Assert.assertEquals(4, bit);
    }

}
