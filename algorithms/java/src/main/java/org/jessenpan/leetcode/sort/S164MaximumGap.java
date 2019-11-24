package org.jessenpan.leetcode.sort;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:sort
 */
public class S164MaximumGap {

    public int maximumGap(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }

}
