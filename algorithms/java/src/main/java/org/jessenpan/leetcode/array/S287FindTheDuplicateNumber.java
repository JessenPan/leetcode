package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S287FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int duplicate = -1;
        int length = nums.length;
        int index;
        for (int i = 0; i < length; i++) {
            index = Math.abs(nums[i]) - 1;
            int val = nums[index];
            if (val < 0) {
                duplicate = Math.abs(nums[i]);
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicate;
    }
}
