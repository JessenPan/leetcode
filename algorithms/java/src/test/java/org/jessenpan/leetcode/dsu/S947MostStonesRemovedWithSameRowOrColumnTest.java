package org.jessenpan.leetcode.dsu;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S947MostStonesRemovedWithSameRowOrColumnTest {

    private S947MostStonesRemovedWithSameRowOrColumn mostStonesRemovedWithSameRowOrColumn = new S947MostStonesRemovedWithSameRowOrColumn();

    @Test
    public void test1() {
        int t = mostStonesRemovedWithSameRowOrColumn.removeStones(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 }, { 2, 2 } });
        Assert.assertEquals(5, t);
    }

    @Test
    public void test2() {
        int t = mostStonesRemovedWithSameRowOrColumn.removeStones(new int[][] { { 0, 0 }, { 0, 2 }, { 1, 1 }, { 2, 0 }, { 2, 2 } });
        Assert.assertEquals(3, t);
    }

    @Test
    public void test3() {
        int t = mostStonesRemovedWithSameRowOrColumn.removeStones(new int[][] { { 0, 0 } });
        Assert.assertEquals(0, t);
    }

}
