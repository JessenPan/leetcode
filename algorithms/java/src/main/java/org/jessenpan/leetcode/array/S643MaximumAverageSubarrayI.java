package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:
 */
public class S643MaximumAverageSubarrayI {

    private double maxAverage;

    public double findMaxAverage(int[] nums, int k) {
        int i = 0, length = nums.length;
        double currentAverage;
        while (i + k <= length) {
            if (i == 0) {
                maxAverage = getMaxAverage(nums, i, k);
            } else {
                currentAverage = getMaxAverage(nums, i, k);
                if (currentAverage > maxAverage) {
                    maxAverage = currentAverage;
                }
            }
            i++;
        }
        return maxAverage;
    }

    private double getMaxAverage(int[] nums, int i, int range) {
        double rangeSum = 0;
        for (int j = 0; j < range; j++) {
            rangeSum += nums[i + j];
        }
        return rangeSum/range;
    }
}
