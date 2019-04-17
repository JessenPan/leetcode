package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S747LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = 0;
        int length = nums.length, maxIndex = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                max = nums[0];
            } else if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int num : nums) {
            if (num == max) {
                continue;
            } else if (num * 2 > max) {
                return -1;
            }
        }
        return maxIndex;
    }
}
