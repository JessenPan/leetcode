package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S932BeautifulArrayTest {

    private S932BeautifulArray beautifulArray = new S932BeautifulArray();

    @Test
    public void test1() {
        int[] arr = beautifulArray.beautifulArray(4);
        Assert.assertArrayEquals(new int[] { 2, 1, 4, 3 }, arr);
    }

    @Test
    public void test2() {
        int[] arr = beautifulArray.beautifulArray(4);
        Assert.assertArrayEquals(new int[] { 3, 1, 2, 5, 4 }, arr);
    }

}
