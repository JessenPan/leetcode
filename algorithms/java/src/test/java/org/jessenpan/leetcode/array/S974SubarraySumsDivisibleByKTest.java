package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S974SubarraySumsDivisibleByKTest {

    private S974SubarraySumsDivisibleByK subarraySumsDivisibleByK = new S974SubarraySumsDivisibleByK();

    @Test
    public void test1() {
        int num = subarraySumsDivisibleByK.subarraysDivByK(new int[] { 4, 5, 0, -2, -3, 1 }, 5);
        Assert.assertEquals(7, num);
    }

}
