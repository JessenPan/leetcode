package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S152MaximumProductSubarrayTest {

    private S152MaximumProductSubarray maximumProductSubarray = new S152MaximumProductSubarray();

    @Test
    public void test1() {
        int max = maximumProductSubarray.maxProduct(new int[] { 2, 3, -2, 4 });
        Assert.assertEquals(6, max);
    }

    @Test
    public void test2() {
        int max = maximumProductSubarray.maxProduct(new int[] { -2, 0, -1 });
        Assert.assertEquals(6, max);
    }

}
