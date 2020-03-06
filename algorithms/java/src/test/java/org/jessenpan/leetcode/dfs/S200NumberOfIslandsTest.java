package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S200NumberOfIslandsTest {

    private S200NumberOfIslands numberOfIslands = new S200NumberOfIslands();

    @Test
    public void test1() {
        int t = numberOfIslands.numIslands(new char[][] { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } });
        Assert.assertEquals(1, t);
    }

    @Test
    public void test2() {
        int t = numberOfIslands.numIslands(new char[][] { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } });
        Assert.assertEquals(3, t);
    }

    @Test
    public void test3() {
        int t = numberOfIslands.numIslands(new char[][] { {} });
        Assert.assertEquals(0, t);
    }

    @Test
    public void test4() {
        int t = numberOfIslands.numIslands(new char[][] { {'1','1','1'},{'0','1','0'},{'1','1','1'} });
        Assert.assertEquals(1, t);
    }

}
