package org.jessenpan.leetcode;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S561ArrayPartitionI {

    public int arrayPairSum(int[] nums) {

        int maxSum = 0;
        Arrays.sort(nums);
        int lengthOfNums = nums.length;
        for (int i = 0; i < lengthOfNums; i = 2 + i) {
            maxSum += nums[i];
        }
        return maxSum;
    }
}
