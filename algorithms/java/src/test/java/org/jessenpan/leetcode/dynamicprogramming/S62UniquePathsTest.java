package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S62UniquePathsTest {

    private S62UniquePaths uniquePaths = new S62UniquePaths();

    @Test
    public void test1() {
        int paths = uniquePaths.uniquePaths(7, 3);
        Assert.assertEquals(28, paths);
    }

    @Test
    public void test2() {
        int paths = uniquePaths.uniquePaths(3, 2);
        Assert.assertEquals(3, paths);
    }

    @Test
    public void test3() {
        int paths = uniquePaths.uniquePaths(23, 12);
        Assert.assertEquals(3, paths);
    }

}
