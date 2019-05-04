package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S414ThirdMaximumNumberTest {

    private S414ThirdMaximumNumber thirdMaximumNumber = new S414ThirdMaximumNumber();

    @Test
    public void test1() {
        int thirdMax = thirdMaximumNumber.thirdMax(new int[] { 3, 2, 1 });
        Assert.assertEquals(1, thirdMax);
    }

    @Test
    public void test2() {
        int thirdMax = thirdMaximumNumber.thirdMax(new int[] { 2, 1 });
        Assert.assertEquals(2, thirdMax);
    }

    @Test
    public void test3() {
        int thirdMax = thirdMaximumNumber.thirdMax(new int[] { 2, 2, 3, 1 });
        Assert.assertEquals(1, thirdMax);
    }

    @Test
    public void test4() {
        int thirdMax = thirdMaximumNumber.thirdMax(new int[] { 1, 2, -2147483648 });
        Assert.assertEquals(-2147483648, thirdMax);
    }

}
