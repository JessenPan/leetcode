package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S198HouseRobberTest {

    private S198HouseRobber houseRobber = new S198HouseRobber();

    @Test
    public void test1() {
        int t = houseRobber.rob(new int[] { 1, 2, 3, 1 });
        Assert.assertEquals(4, t);
    }

    @Test
    public void test2() {
        int t = houseRobber.rob(new int[] { 2, 7, 9, 3, 1 });
        Assert.assertEquals(12, t);
    }

}
