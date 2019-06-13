package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S6ZigZagConversionTest {

    private S6ZigZagConversion zigZagConversion = new S6ZigZagConversion();

    @Test
    public void test1() {
        String str = zigZagConversion.convert("LEETCODEISHIRING", 3);
        Assert.assertEquals("LCIRETOESIIGEDHN", str);
    }

    @Test
    public void test2() {
        String str = zigZagConversion.convert("LEETCODEISHIRING", 4);
        Assert.assertEquals("LDREOEIIECIHNTSG", str);
    }

}
