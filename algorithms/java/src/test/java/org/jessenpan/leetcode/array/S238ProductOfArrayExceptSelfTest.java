package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S238ProductOfArrayExceptSelfTest {

    private S238ProductOfArrayExceptSelf productOfArrayExceptSelf = new S238ProductOfArrayExceptSelf();

    @Test
    public void test1() {
        int[] array = productOfArrayExceptSelf.productExceptSelf(new int[] { 1, 2, 3, 4 });
        Assert.assertArrayEquals(new int[] { 24, 12, 8, 6 }, array);
    }

}
