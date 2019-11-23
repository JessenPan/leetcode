package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S413ArithmeticSlicesTest {

    private S413ArithmeticSlices arithmeticSlices = new S413ArithmeticSlices();

    @Test
    public void test1() {
        int n = arithmeticSlices.numberOfArithmeticSlices(new int[] { 1, 2, 3, 4 });
        Assert.assertEquals(3, n);
    }

    @Test
    public void test2() {
        int n = arithmeticSlices.numberOfArithmeticSlices(new int[] { 1, 2, 3, 4, 5, 6 });
        Assert.assertEquals(10, n);
    }

}
