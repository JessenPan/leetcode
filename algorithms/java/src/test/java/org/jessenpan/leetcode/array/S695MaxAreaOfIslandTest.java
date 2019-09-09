package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S695MaxAreaOfIslandTest {

    private S695MaxAreaOfIsland maxAreaOfIsland = new S695MaxAreaOfIsland();

    @Test
    public void test1() {
        int area = maxAreaOfIsland.maxAreaOfIsland(new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } });
        Assert.assertEquals(6, area);
    }

    @Test
    public void test2() {
        int area = maxAreaOfIsland.maxAreaOfIsland(new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0 } });
        Assert.assertEquals(0, area);
    }
}
