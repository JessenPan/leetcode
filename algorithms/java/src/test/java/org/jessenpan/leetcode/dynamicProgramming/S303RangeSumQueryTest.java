package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Test;

import static org.jessenpan.leetcode.dynamicProgramming.S303RangeSumQuery.NumArray;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S303RangeSumQueryTest {

    @Test
    public void test1() {
        NumArray rangeSumQuery = new NumArray(new int[] { -2, 0, 3, -5, 2, -1 });
        int rangeSum1 = rangeSumQuery.sumRange(0, 2);
        assertEquals(1, rangeSum1);
        int rangeSum2 = rangeSumQuery.sumRange(2, 5);
        assertEquals(-1, rangeSum2);
        int rangeSum3 = rangeSumQuery.sumRange(0, 5);
        assertEquals(-3, rangeSum3);
    }

}
