package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binary search
 */
public class S35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid] && target > nums[mid - 1]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
