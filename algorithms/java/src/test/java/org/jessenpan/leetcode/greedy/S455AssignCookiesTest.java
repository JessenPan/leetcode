package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S455AssignCookiesTest {

    private S455AssignCookies assignCookies = new S455AssignCookies();

    @Test
    public void test1() {
        int val = assignCookies.findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 });
        Assert.assertEquals(1, val);
    }

    @Test
    public void test2() {
        int val = assignCookies.findContentChildren(new int[] { 1, 2 }, new int[] { 1, 2, 3 });
        Assert.assertEquals(2, val);
    }

}
