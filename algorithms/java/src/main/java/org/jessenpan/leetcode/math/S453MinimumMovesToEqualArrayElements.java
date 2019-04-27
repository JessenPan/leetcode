package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S453MinimumMovesToEqualArrayElements {

    public int minMoves(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        long sum = 0L;
        long min = nums[0];
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }
        return (int) (sum-min*nums.length);
    }

}
