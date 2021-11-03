package org.jessenpan.leetcode.bfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S54201MatrixTest {

    private S54201Matrix matrix = new S54201Matrix();

    @Test
    public void test1() {
        int[][] mx = matrix.updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } });
        Assert.assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }, mx);
    }

    @Test
    public void test2() {
        int[][] mx = matrix.updateMatrix(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } });
        Assert.assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 } }, mx);
    }


    @Test
    public void test3() {
    }
}
