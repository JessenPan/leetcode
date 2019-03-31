package org.jessenpan.leetcode.dynamicprogramming;

/**
 * @author jessenpan
 * tag:dynamic programing
 */
public class S303RangeSumQuery {

    public static class NumArray {

        private int[] sumNums;

        public NumArray(int[] nums) {
            sumNums = new int[nums.length];
            int lengthOfNums = nums.length;
            for (int i = 0; i < lengthOfNums; i++) {
                if (i == 0) {
                    sumNums[i] = nums[i];
                } else {
                    sumNums[i] = nums[i] + sumNums[i - 1];
                }
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sumNums[j];
            } else {
                return sumNums[j] - sumNums[i - 1];
            }
        }
    }
}
