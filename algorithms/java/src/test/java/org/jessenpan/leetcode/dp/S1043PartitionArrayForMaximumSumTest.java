package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1043PartitionArrayForMaximumSumTest {

    private S1043PartitionArrayForMaximumSum partitionArrayForMaximumSum = new S1043PartitionArrayForMaximumSum();

    @Test
    public void test1() {
        int t = partitionArrayForMaximumSum.maxSumAfterPartitioning(new int[] { 1, 15, 7, 9, 2, 5, 10 }, 3);
        Assert.assertEquals(84, t);
    }

}
