package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S55JumpGame {

    public boolean canJump(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return true;
        }
        int len = nums.length;
        int startIdx = 0;
        while (startIdx < len) {

            if (nums[startIdx] == 0) {
                return false;
            }
            int endIdx = nums[startIdx] + startIdx;
            if (endIdx >= len - 1) {
                return true;
            }
            int i = startIdx + 1;
            int maxIdx = i, maxLen = nums[i] + i;
            while (i <= endIdx) {
                if (nums[i] + i > maxLen) {
                    maxLen = nums[i] + i;
                    maxIdx = i;
                }
                i++;
            }
            startIdx = maxIdx;
        }
        return true;
    }

}
