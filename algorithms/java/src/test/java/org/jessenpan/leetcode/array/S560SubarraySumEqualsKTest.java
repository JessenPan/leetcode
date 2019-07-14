package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S560SubarraySumEqualsKTest {

    private S560SubarraySumEqualsK subarraySumEqualsK = new S560SubarraySumEqualsK();

    @Test
    public void test1() {
        int sum = subarraySumEqualsK.subarraySum(new int[] { 1, 1, 1 }, 2);
        Assert.assertEquals(2, sum);
    }

    @Test
    public void test2() {
        int sum = subarraySumEqualsK.subarraySum(new int[] { 1 }, 0);
        Assert.assertEquals(0, sum);
    }

    @Test
    public void test3() {
        int sum = subarraySumEqualsK.subarraySum(new int[] { -1, -1, 1 }, 0);
        Assert.assertEquals(1, sum);
    }

    @Test
    public void test4() {
        int sum = subarraySumEqualsK.subarraySum(new int[] { 28, 54, 7, -70, 22, 65, -6 }, 100);
        Assert.assertEquals(1, sum);
    }

}
