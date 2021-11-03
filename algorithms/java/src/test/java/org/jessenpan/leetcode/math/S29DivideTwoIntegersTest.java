package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S29DivideTwoIntegersTest {

    private S29DivideTwoIntegers divideTwoIntegers = new S29DivideTwoIntegers();

    @Test
    public void test1() {
        int t = divideTwoIntegers.divide(10, 3);
        Assert.assertEquals(3, t);
    }

}
