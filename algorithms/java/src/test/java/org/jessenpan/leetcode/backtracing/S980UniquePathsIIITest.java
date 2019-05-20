package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S980UniquePathsIII;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S980UniquePathsIIITest {

    private S980UniquePathsIII uniquePathsIII = new S980UniquePathsIII();

    @Test
    public void test1() {
        int uniquePath = uniquePathsIII.uniquePathsIII(new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } });
        Assert.assertEquals(2, uniquePath);
    }

    @Test
    public void test2() {
        int uniquePath = uniquePathsIII.uniquePathsIII(new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 2 } });
        Assert.assertEquals(4, uniquePath);
    }

    @Test
    public void test3() {
        int uniquePath = uniquePathsIII.uniquePathsIII(new int[][] { { 0, 1 }, { 2, 0 } });
        Assert.assertEquals(0, uniquePath);
    }

}
