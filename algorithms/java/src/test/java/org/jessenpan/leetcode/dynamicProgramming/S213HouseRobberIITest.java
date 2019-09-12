package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S213HouseRobberIITest {

    private S213HouseRobberII houseRobberII = new S213HouseRobberII();

    @Test
    public void test1() {
        int v = houseRobberII.rob(new int[] { 2, 3, 2 });
        Assert.assertEquals(3, v);
    }

    @Test
    public void test2() {
        int v = houseRobberII.rob(new int[] { 1, 2, 3, 1 });
        Assert.assertEquals(4, v);
    }

}
