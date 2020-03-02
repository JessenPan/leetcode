package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S481MagicalStringTest {

    private S481MagicalString magicalString = new S481MagicalString();

    @Test
    public void test1() {
        int t = magicalString.magicalString(6);
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = magicalString.magicalString(19);
        Assert.assertEquals(9, t);
    }

    @Test
    public void test3() {
        int t = magicalString.magicalString(7);
        Assert.assertEquals(4, t);
    }

}
