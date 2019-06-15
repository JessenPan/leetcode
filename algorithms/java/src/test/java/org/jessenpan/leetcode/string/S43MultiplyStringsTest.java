package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S43MultiplyStringsTest {

    private S43MultiplyStrings multiplyStrings = new S43MultiplyStrings();

    @Test
    public void test1() {
        String r = multiplyStrings.multiply("123", "456");
        Assert.assertEquals("56088", r);
    }

    @Test
    public void test2() {
        String r = multiplyStrings.multiply("2", "3");
        Assert.assertEquals("6", r);
    }

    @Test
    public void test3() {
        String r = multiplyStrings.multiply("0", "0");
        Assert.assertEquals("0", r);
    }

}
