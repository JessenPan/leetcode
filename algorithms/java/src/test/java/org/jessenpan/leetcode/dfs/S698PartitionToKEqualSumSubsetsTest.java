package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S698PartitionToKEqualSumSubsetsTest {

    private S698PartitionToKEqualSumSubsets partitionToKEqualSumSubsets = new S698PartitionToKEqualSumSubsets();

    @Test
    public void test1() {
        boolean valid = partitionToKEqualSumSubsets.canPartitionKSubsets(new int[] { 4, 3, 2, 3, 5, 2, 1 }, 4);
        Assert.assertTrue(valid);
    }

}
