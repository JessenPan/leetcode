package org.jessenpan.leetcode.dsu;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S684RedundantConnectionTest {

    private S684RedundantConnection redundantConnection = new S684RedundantConnection();

    @Test
    public void test1() {
        int[] connection = redundantConnection.findRedundantConnection(new int[][] { { 1, 2 }, { 1, 3 }, { 2, 3 } });
        Assert.assertArrayEquals(new int[] { 2, 3 }, connection);
    }

    @Test
    public void test2() {
        int[] connection = redundantConnection.findRedundantConnection(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 1, 5 } });
        Assert.assertArrayEquals(new int[] { 1, 4 }, connection);
    }

    @Test
    public void test3() {
        int[] connection = redundantConnection.findRedundantConnection(new int[][] { { 1, 3 }, { 3, 4 }, { 1, 5 }, { 3, 5 }, { 2, 3 } });
        Assert.assertArrayEquals(new int[] { 3, 5 }, connection);
    }

}
