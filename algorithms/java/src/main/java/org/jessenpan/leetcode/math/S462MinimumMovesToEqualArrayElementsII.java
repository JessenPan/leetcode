package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S462MinimumMovesToEqualArrayElementsII {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = 0;
        if (nums.length % 2 == 0) {
            mid = (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            mid = nums[nums.length / 2];
        }
        int minMove = 0;
        for (int num : nums) {
            minMove += Math.abs(mid - num);
        }
        return minMove;
    }
}
