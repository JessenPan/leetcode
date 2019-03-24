package org.jessenpan.leetcode;

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

        int left = 0, right = nums.length - 1;
        int middle = 0;
        while (true) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
                if (left > right) {
                    return middle;
                }
            } else {
                left = middle + 1;
                if (left > right) {
                    return middle + 1;
                }
            }
        }
    }
}
