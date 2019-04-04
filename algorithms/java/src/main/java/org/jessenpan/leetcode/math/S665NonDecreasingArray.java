package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S665NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int changeSum = 0, length = nums.length, lastMax = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    changeSum++;
                    lastMax = nums[i] = nums[i + 1];
                } else {
                    lastMax = nums[i];
                }
            }
            if (nums[i] < lastMax) {
                changeSum++;
                if (changeSum > 1) {
                    return false;
                } else {
                    nums[i] = lastMax;
                }
            } else {
                lastMax = nums[i];
            }
        }
        return true;
    }
}
