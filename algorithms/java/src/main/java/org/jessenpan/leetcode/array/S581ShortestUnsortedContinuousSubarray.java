package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S581ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int low = -1, high = -1, len = nums.length;
        int min = nums[len - 1], max = nums[0];
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] > min) {
                low = i;
            }
            min = Math.min(min, nums[i]);
        }

        if (low == -1) {
            return 0;
        }

        for (int i = 1; i < len; i++) {

            if (max > nums[i]) {
                high = i;
            }
            max = Math.max(max, nums[i]);
        }

        return high - low + 1;
    }
}
