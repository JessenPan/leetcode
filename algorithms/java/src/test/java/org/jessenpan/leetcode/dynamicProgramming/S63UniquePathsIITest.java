package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S63UniquePathsIITest {

    private S63UniquePathsII uniquePathsII = new S63UniquePathsII();

    @Test
    public void test1() {
        int path = uniquePathsII.uniquePathsWithObstacles(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } });
        Assert.assertEquals(2, path);
    }

    @Test
    public void test2() {
        int path = uniquePathsII.uniquePathsWithObstacles(new int[][] { { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 } });
        Assert.assertEquals(1, path);
    }

    @Test
    public void test3() {
        int path = uniquePathsII.uniquePathsWithObstacles(new int[][] { { 0 } });
        Assert.assertEquals(1, path);
    }
}
