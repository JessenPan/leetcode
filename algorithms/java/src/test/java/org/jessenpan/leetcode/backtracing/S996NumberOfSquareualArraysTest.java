package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S996NumberOfSquareualArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S996NumberOfSquareualArraysTest {

    private S996NumberOfSquareualArrays numberOfSquareualArrays = new S996NumberOfSquareualArrays();

    @Test
    public void test1() {
        int num = numberOfSquareualArrays.numSquarefulPerms(new int[] { 1, 17, 8 });
        Assert.assertEquals(2, num);
    }

    @Test
    public void test2() {
        int num = numberOfSquareualArrays.numSquarefulPerms(new int[] { 2, 2, 2 });
        Assert.assertEquals(1, num);
    }

    @Test
    public void test3() {
        int num = numberOfSquareualArrays.numSquarefulPerms(new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 });
        Assert.assertEquals(1, num);
    }

}
