package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S209MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {

        int minLen = 0, len = nums.length;
        int tmpLen = 0, tmpSum = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            tmpLen = 0;
            tmpSum = 0;
            j = i;
            while (tmpSum < s && j < len) {
                tmpSum += nums[j];
                j++;
                tmpLen++;
            }
            if (tmpSum >= s) {
                minLen = (minLen == 0) ? tmpLen : Math.min(minLen, tmpLen);
            }
        }
        return minLen;
    }
}
