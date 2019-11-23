package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S72EditDistanceTest {

    private S72EditDistance editDistance = new S72EditDistance();

    @Test
    public void test1() {
        int dis = editDistance.minDistance("horse", "ros");
        Assert.assertEquals(3, dis);
    }

    @Test
    public void test2() {
        int dis = editDistance.minDistance("intention", "execution");
        Assert.assertEquals(5, dis);
    }

}
