package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S915PartitionArrayIntoDisjointIntervalsTest {

    private S915PartitionArrayIntoDisjointIntervals partitionArrayIntoDisjointIntervals = new S915PartitionArrayIntoDisjointIntervals();

    @Test
    public void test1() {
        int idx = partitionArrayIntoDisjointIntervals.partitionDisjoint(new int[] { 5, 0, 3, 8, 6 });
        Assert.assertEquals(3, idx);
    }

    @Test
    public void test2() {
        int idx = partitionArrayIntoDisjointIntervals.partitionDisjoint(new int[] { 1, 1, 1, 0, 6, 12 });
        Assert.assertEquals(4, idx);
    }

}
