package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S581ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int low = -1;
        int min = nums[nums.length - 1];
        int high = -1;
        int max = nums[0];
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] > min) {
                low = i;
            } else {
                min = nums[i];
            }

        }
        if (low == -1) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < max) {
                high = i;
            } else {
                max = nums[i];
            }
        }
        return high - low + 1;
    }
}
