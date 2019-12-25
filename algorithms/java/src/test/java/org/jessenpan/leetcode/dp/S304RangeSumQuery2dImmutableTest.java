package org.jessenpan.leetcode.dp;

import org.jessenpan.leetcode.dp.S304RangeSumQuery2dImmutable.NumMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S304RangeSumQuery2dImmutableTest {

    @Test
    public void test1() {
        NumMatrix rangeSumQuery2dImmutable = new NumMatrix(new int[][] { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 }, { 1, 0, 3, 0, 5 } });
        int t = rangeSumQuery2dImmutable.sumRegion(2, 1, 4, 3);
        Assert.assertEquals(8, t);
        t=rangeSumQuery2dImmutable.sumRegion(1,1,2,2);
        Assert.assertEquals(11,t);
        t=rangeSumQuery2dImmutable.sumRegion(1,2,2,4);
        Assert.assertEquals(12,t);
    }

}
