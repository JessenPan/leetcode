package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:
 */
public class S643MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int length = nums.length, left = 0, right = left + k - 1;
        for (int i = left; i <= right; i++) {
            max += nums[i];
        }
        if (length == k) {
            return max / (double) k;
        }
        int lastRangeSum = max;
        while (right + 1 < length) {
            lastRangeSum -= nums[left];
            left++;
            right++;
            lastRangeSum += nums[right];
            max = Math.max(max, lastRangeSum);
        }
        return max / (double) k;
    }

}
