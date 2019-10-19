package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S41FirstMissingPositiveTest {

    private S41FirstMissingPositive firstMissingPositive = new S41FirstMissingPositive();

    @Test
    public void test1() {
        int v = firstMissingPositive.firstMissingPositive(new int[] { 1, 2, 0 });
        Assert.assertEquals(3, v);
    }

    @Test
    public void test2() {
        int v = firstMissingPositive.firstMissingPositive(new int[] { 3, 4, -1, 1 });
        Assert.assertEquals(2, v);
    }

    @Test
    public void test3() {
        int v = firstMissingPositive.firstMissingPositive(new int[] { 7, 8, 9, 11, 12 });
        Assert.assertEquals(1, v);
    }
}
