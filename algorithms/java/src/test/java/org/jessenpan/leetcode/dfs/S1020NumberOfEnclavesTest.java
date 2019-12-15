package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1020NumberOfEnclavesTest {

    private S1020NumberOfEnclaves numberOfEnclaves = new S1020NumberOfEnclaves();

    @Test
    public void test1() {
        int n = numberOfEnclaves.numEnclaves(new int[][] { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } });
        Assert.assertEquals(3, n);
    }

    @Test
    public void test2() {
        int n = numberOfEnclaves.numEnclaves(new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } });
        Assert.assertEquals(0, n);
    }

}
