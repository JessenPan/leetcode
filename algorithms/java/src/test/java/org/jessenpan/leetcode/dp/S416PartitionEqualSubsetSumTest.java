package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S416PartitionEqualSubsetSumTest {

    private S416PartitionEqualSubsetSum partitionEqualSubsetSum = new S416PartitionEqualSubsetSum();

    @Test
    public void test1() {
        boolean valid = partitionEqualSubsetSum.canPartition(new int[] { 1, 5, 11, 5 });
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = partitionEqualSubsetSum.canPartition(new int[] { 1, 2, 3, 5 });
        Assert.assertFalse(valid);
    }

}
