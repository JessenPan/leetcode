package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S264UglyNumberIITest {

    private S264UglyNumberII uglyNumberII = new S264UglyNumberII();

    @Test
    public void test1() {
        int t = uglyNumberII.nthUglyNumber(10);
        Assert.assertEquals(12, t);
    }

}
