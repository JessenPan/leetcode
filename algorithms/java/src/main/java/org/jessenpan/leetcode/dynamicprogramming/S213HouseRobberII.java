package org.jessenpan.leetcode.dynamicprogramming;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S213HouseRobberII {

    public int rob(int[] nums) {
        if (nums.length <= 2) {
            return Arrays.stream(nums).max().orElse(0);
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end) {

        int prevMax = 0, ppMax = 0;
        for (int i = start; i <= end; i++) {
            int temp = prevMax;
            prevMax = Math.max(ppMax + nums[i], prevMax);
            ppMax = temp;
        }
        return prevMax;
    }
}
