package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S984StringWithoutAAAOrBBBTest {

    private S984StringWithoutAAAOrBBB stringWithoutAAAOrBBB = new S984StringWithoutAAAOrBBB();

    @Test
    public void test1() {
        String str = stringWithoutAAAOrBBB.strWithout3a3b(1, 2);
        Assert.assertEquals("abb", str);
    }

    @Test
    public void test2() {
        String str = stringWithoutAAAOrBBB.strWithout3a3b(4, 1);
        Assert.assertEquals("aabaa", str);
    }

    @Test
    public void test3() {
        String str = stringWithoutAAAOrBBB.strWithout3a3b(1, 3);
        Assert.assertEquals("bbab", str);
    }

    @Test
    public void test4() {
        String str = stringWithoutAAAOrBBB.strWithout3a3b(1, 4);
        Assert.assertEquals("bbabb", str);
    }

    @Test
    public void test5() {
        String str = stringWithoutAAAOrBBB.strWithout3a3b(2, 5);
        Assert.assertEquals("bbabbab", str);
    }

}
