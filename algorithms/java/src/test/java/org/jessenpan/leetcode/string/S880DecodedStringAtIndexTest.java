package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S880DecodedStringAtIndexTest {

    private S880DecodedStringAtIndex decodedStringAtIndex = new S880DecodedStringAtIndex();

    @Test
    public void test1() {
        String c = decodedStringAtIndex.decodeAtIndex("leet2code3", 10);
        Assert.assertEquals("o", c);
    }

    @Test
    public void test2() {
        String c = decodedStringAtIndex.decodeAtIndex("ha22", 5);
        Assert.assertEquals("h", c);
    }

    @Test
    public void test3() {
        String c = decodedStringAtIndex.decodeAtIndex("a2345678999999999999999", 1);
        Assert.assertEquals("a", c);
    }

}
