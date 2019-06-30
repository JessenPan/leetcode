package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S313SuperUglyNumberTest {

    private S313SuperUglyNumber superUglyNumber = new S313SuperUglyNumber();

    @Test
    public void test1() {
        int ugly = superUglyNumber.nthSuperUglyNumber(12, new int[] { 2, 7, 13, 19 });
        Assert.assertEquals(32, ugly);
    }

}
