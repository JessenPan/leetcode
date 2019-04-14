package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S674LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int maxLength = -1, count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                count = 1;
            } else if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                if (count > maxLength) {
                    maxLength = count;
                }
                count = 1;
            }
        }
        return count>maxLength ? count : maxLength;
    }

}
