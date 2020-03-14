package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S523ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }

        int len = nums.length;
        int[] sums = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                sums[i] = nums[i];
                continue;
            }
            sums[i] = sums[i - 1] + nums[i];
        }

        if (k == 0) {
            for (int i = 1; i < len; i++) {
                if (nums[i] == 0 && nums[i - 1] == 0) {
                    return true;
                }
            }
            return false;
        }

        for (int right = 1; right < len; right++) {
            for (int left = -1; left + 2 <= right; left++) {
                if (left == -1) {
                    if (sums[right] % k == 0) {
                        return true;
                    }
                    continue;
                }

                if ((sums[right] - sums[left]) % k == 0) {
                    return true;
                }
            }
        }

        return false;
    }

}
