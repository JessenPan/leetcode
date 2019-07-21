package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S713SubarrayProductLessThanKTest {

    private S713SubarrayProductLessThanK subarrayProductLessThanK = new S713SubarrayProductLessThanK();

    @Test
    public void test1() {
        int num = subarrayProductLessThanK.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 100);
        Assert.assertEquals(8, num);
    }
}
