package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S153FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        int left = 0, right = len - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > nums[middle + 1]) {
                return nums[middle + 1];
            }
            if (middle == left || middle == right) {
                break;
            }
            if (nums[middle] > nums[right]) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return nums[left];
    }
}
