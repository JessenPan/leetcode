package org.jessenpan.leetcode.dp;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dp
 */
public class S698PartitionToKEqualSumSubsets {

    private int sub;

    private int k;

    private int[] nums;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k > nums.length) {
            return false;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        sub = sum / k;
        if (Arrays.stream(nums).max().getAsInt() > sub) {
            return false;
        }
        this.k = k;
        this.nums = nums;
        return find(0, 0);
    }

    private boolean find(int currentSum, int groupNum) {

        return false;
    }

}
