package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S65ValidNumberTest {

    private S65ValidNumber validNumber = new S65ValidNumber();

    @Test
    public void test1() {
        Assert.assertTrue(validNumber.isNumber("0.1"));
    }

}
